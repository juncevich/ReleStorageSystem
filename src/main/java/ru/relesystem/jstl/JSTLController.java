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

    @Autowired
    @Qualifier("jpaRelayService")
    private RelayService relayService;

    @RequestMapping(value = "/jstlReturnRelays", method = RequestMethod.GET)
    public ModelAndView jstlListRelays() {
        List<Relay> relayList = relayService.findAll();
        return new ModelAndView("jstl/jstl", "jstlResultObjectList", relayList);
    }

    @RequestMapping(value="/jstlRelay", method=RequestMethod.GET)
    public ModelAndView jstlGetRelay() {;

        return new ModelAndView("jstl/jstl", "jstlResultObject", relayService.findById(1L));
    }

    @RequestMapping(value="/jstlHTML", method=RequestMethod.GET)
    public ModelAndView returnHTML(Model uiModel) {
        String html = "<font color='red'><b>Test Color Red</b></font>";
        uiModel.addAttribute(html);
        return new ModelAndView("jstl/jstl", "jstlResultHTML", html);
    }

}
