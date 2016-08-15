package ru.relesystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.relesystem.entities.Relay;
import ru.relesystem.services.RelayService;

import java.util.List;


@Controller
public class JSTLController {


    private RelayService relayService;

    @RequestMapping(value = "/jstlReturnRelays", method = RequestMethod.GET)
    public ModelAndView listRelays() {
        List<Relay> relayList = relayService.findAll();
        return new ModelAndView("jstl/jstl", "jstlObjectList", relayList);
    }

    @RequestMapping(value="/jstlRelay", method=RequestMethod.GET)
    public ModelAndView getRelay() {;
        return new ModelAndView("jstl/jstl", "jstlObject", relayService.findById(1L));
    }

    @RequestMapping(value="/jstlHTML", method=RequestMethod.GET)
    public ModelAndView returnHTML() {
        return new ModelAndView("jstl/jstl", "jstlHTML", "<font color='red'><b>Test Color Red</b></font>");
    }

    @Qualifier("jpaRelayService")
    @Autowired
    public void setRelayService( RelayService relayService) {
        this.relayService = relayService;
    }

}
