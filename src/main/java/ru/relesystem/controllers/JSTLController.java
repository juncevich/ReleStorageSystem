package ru.relesystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.relesystem.services.RelayService;


@Controller
public class JSTLController {

    @Autowired
    private RelayService relayService;

    @RequestMapping(value = "/jstlReturnRelays", method = RequestMethod.GET)
    public ModelAndView listRelays() {
        return new ModelAndView("jstl/jstl", "resultObjectList", relayService.findAll());
    }

    @RequestMapping(value="/jstlRelay", method=RequestMethod.GET)
    public ModelAndView getRelay() {;
        return new ModelAndView("jstl/jstl", "resultObject", relayService.findById(1L));
    }

    @RequestMapping(value="/jstlHTML", method=RequestMethod.GET)
    public ModelAndView returnHTML() {
        return new ModelAndView("jstl/jstl", "resultHTML", "<font color='red'><b>Test Color Red</b></font>");
    }

}
