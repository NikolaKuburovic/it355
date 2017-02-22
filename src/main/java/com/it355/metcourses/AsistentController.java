package com.it355.metcourses;

import com.it355.model.Asistent;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Nikola Kuburovic 1095
 */
@Controller
public class AsistentController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/asistent", method = RequestMethod.GET)
    public ModelAndView asistent() {
        System.out.println("Pozivam message source");
        System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        return new ModelAndView("asistent", "command", new Asistent());
    }

    @RequestMapping(value = "/addAsistent", method = RequestMethod.GET)
    public String addAsistent(@ModelAttribute Asistent asistent, ModelMap model) {
        model.addAttribute("ime", asistent.getIme());
        model.addAttribute("prezime", asistent.getPrezime());
        model.addAttribute("oblast", asistent.getOblast());
        return "result";

    }
}
