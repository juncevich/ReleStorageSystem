package ru.relesystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.relesystem.entities.Relay;
import ru.relesystem.services.RelayService;

import java.util.List;

@RequestMapping("/relays")
@Controller
public class RelayController {
    private final Logger logger = LoggerFactory.getLogger(RelayController.class);

    private RelayService relayService;


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        logger.info("Listing relays");

        List<Relay> relays = relayService.findAll();
        uiModel.addAttribute("relays", relays);

        logger.info("No. of relays: " + relays.size());

        return "relays/list";
    }



    @Autowired
    public void setRelayService(RelayService relayService) {
        this.relayService = relayService;
    }

}
