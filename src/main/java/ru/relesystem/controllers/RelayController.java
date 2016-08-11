package ru.relesystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.relesystem.entities.Relay;
import ru.relesystem.services.RelayService;

import java.util.List;


@Controller
public class RelayController {
    private final Logger logger = LoggerFactory.getLogger(RelayController.class);

    private RelayService relayService;


    @RequestMapping(value = "/listReleays", method= RequestMethod.GET)
    public ModelAndView listReleays(Model uiModel) {
        logger.info("Listing relays");

        List<Relay> relays = relayService.findAll();
        uiModel.addAttribute("relays", relays);

        logger.info("No. of relays: " + relays.size());

        return new ModelAndView("/relays/relays", "resultObject", relays);
    }



    @Autowired
    public void setRelayService(RelayService relayService) {
        this.relayService = relayService;
    }

}
