package ru.relesystem.jstl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return new ModelAndView("jstl/jstl", "resultObjectList", relayList);
    }

    @RequestMapping(value="/jstlRelay", method=RequestMethod.GET)
    public ModelAndView getRelay() {;
        return new ModelAndView("jstl/jstl", "resultObject", relayService.findById(1L));
    }

    @RequestMapping(value="/jstlHTML", method=RequestMethod.GET)
    public ModelAndView returnHTML(Model uiModel) {
        String html = "<font color='red'><b>Test Color Red</b></font>";
        uiModel.addAttribute(html);
        return new ModelAndView("jstl/jstl", "resultHTML", html);
    }


    @Autowired
    @Qualifier("jpaRelayService")
    public void setRelayService( RelayService relayService) {
        this.relayService = relayService;
    }

}
