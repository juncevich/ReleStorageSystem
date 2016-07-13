package ru.relesystem.controllers;

import com.google.common.collect.Lists;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.Message;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.relesystem.RelayGrid;
import ru.relesystem.UrlUtil;
import ru.relesystem.entities.Relay;
import ru.relesystem.services.RelayService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RequestMapping("/relay")
@Controller
public class RelayController {
    private final Logger logger = LoggerFactory.getLogger(RelayController.class);

    private RelayService relayService;
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        logger.info("Listing relay");

        List<Relay> relays = relayService.findAll();
        uiModel.addAttribute("contacts", relays);

        logger.info("No. of contacts: " + relays.size());

        return "relays/list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") Long id, Model uiModel) {
        Relay relay = relayService.findById(id);
        uiModel.addAttribute("relay", relay);

        return "relay/show";
    }

    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.POST)
    public String update(@Valid Relay relay, BindingResult bindingResult, Model uiModel,
                         HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes,
                         Locale locale) {
        logger.info("Updating contact");
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("message", new Message("error",
                    messageSource.getMessage("relay_save_fail", new Object[]{}, locale)));
            uiModel.addAttribute("contact", relay);
            return "relay/update";
        }
        uiModel.asMap().clear();
        redirectAttributes.addFlashAttribute("message", new Message("success",
                messageSource.getMessage("relay_save_success", new Object[]{}, locale)));
        relayService.save(relay);
        return "redirect:/reles/" + UrlUtil.encodeUrlPathSegment(relay.getId().toString(),
                httpServletRequest);
    }

    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("relay", relayService.findById(id));
        return "relay/update";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@Valid Relay relay, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale, @RequestParam(value = "file", required = false) Part file) {
        logger.info("Creating relay");
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("message", new Message("error",
                    messageSource.getMessage("relay_save_fail", new Object[]{}, locale)));
            uiModel.addAttribute("relay", relay);
            return "relay/create";
        }
        uiModel.asMap().clear();
        redirectAttributes.addFlashAttribute("message", new Message("success",
                messageSource.getMessage("relay_save_success", new Object[]{}, locale)));

        logger.info("relay id: " + relay.getId());

        // Process upload file
        if (file != null) {
            logger.info("File name: " + file.getName());
            logger.info("File size: " + file.getSize());
            logger.info("File content type: " + file.getContentType());
            byte[] fileContent = null;
            try {
                InputStream inputStream = file.getInputStream();
                if (inputStream == null) logger.info("File inputstream is null");
                fileContent = IOUtils.toByteArray(inputStream);
                relay.setPhoto(fileContent);
            } catch (IOException ex) {
                logger.error("Error saving uploaded file");
            }
            relay.setPhoto(fileContent);
        }

        relayService.save(relay);
        return "redirect:/relay/";
    }

    @RequestMapping(value = "/photo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public byte[] downloadPhoto(@PathVariable("id") Long id) {
        Relay relay = relayService.findById(id);

        if (relay.getPhoto() != null) {
            logger.info("Downloading photo for id: {} with size: {}", relay.getId(),
                    relay.getPhoto().length);
        }

        return relay.getPhoto();
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(Model uiModel) {
        Relay relay = new Relay();
        uiModel.addAttribute("relay", relay);

        return "contacts/create";
    }

    @ResponseBody
    @RequestMapping(value = "/listgrid", method = RequestMethod.GET, produces = "application/json")
    public RelayGrid listGrid(@RequestParam(value = "page", required = false) Integer page,
                              @RequestParam(value = "rows", required = false) Integer rows,
                              @RequestParam(value = "sidx", required = false) String sortBy,
                              @RequestParam(value = "sord", required = false) String order) {

        logger.info("Listing relay for grid with page: {}, rows: {}", page, rows);
        logger.info("Listing relay for grid with sort: {}, order: {}", sortBy, order);

        // Process order by
        Sort sort = null;
        String orderBy = sortBy;
        if (orderBy != null && orderBy.equals("birthDateString"))
            orderBy = "birthDate";

        if (orderBy != null && order != null) {
            if (order.equals("desc")) {
                sort = new Sort(Sort.Direction.DESC, orderBy);
            } else
                sort = new Sort(Sort.Direction.ASC, orderBy);
        }

        // Constructs page request for current page
        // Note: page number for Spring Data JPA starts with 0, while jqGrid starts with 1
        PageRequest pageRequest = null;

        if (sort != null) {
            pageRequest = new PageRequest(page - 1, rows, sort);
        } else {
            pageRequest = new PageRequest(page - 1, rows);
        }

        Page<Relay> contactPage = relayService.findAllByPage(pageRequest);

        // Construct the grid data that will return as JSON data
        RelayGrid relayGrid = new RelayGrid();

        relayGrid.setCurrentPage(contactPage.getNumber() + 1);
        relayGrid.setTotalPages(contactPage.getTotalPages());
        relayGrid.setTotalRecords(contactPage.getTotalElements());

        relayGrid.setContactData(Lists.newArrayList(contactPage.iterator()));

        return relayGrid;
    }

    @Autowired
    public void setContactService(RelayService relayService) {
        this.relayService = relayService;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}