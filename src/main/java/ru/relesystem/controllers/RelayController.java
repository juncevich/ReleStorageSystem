package ru.relesystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping(value = "/listRelays", method= RequestMethod.GET)
    public ModelAndView listRelays(Model uiModel) {
        logger.info("Listing relays");

        List<Relay> relays = relayService.findAll();
        uiModel.addAttribute("relays", relays);

        logger.info("No. of relays: " + relays.size());

        return new ModelAndView("/relays/relays", "resultObject", relays);
    }

    @RequestMapping(value = "/queryFindByIdRelay/{realayid}", method = RequestMethod.GET)
    public ModelAndView queryFindByIdUser(@PathVariable("realayid") Long relayid) {
        System.out.println("RelayController queryFindByIdRelay is called");
        Relay relay = relayService.findById(relayid);
        return new ModelAndView("/relays/relays", "resultObject", relay);
    }


    @Autowired
    @Qualifier("jpaRelayService")
    public void setRelayService( RelayService relayService) {
        this.relayService = relayService;
    }

}
