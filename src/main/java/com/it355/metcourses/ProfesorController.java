package com.it355.metcourses;

import com.it355.model.Profesor;
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
public class ProfesorController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/profesor", method = RequestMethod.GET)
    public ModelAndView profesor() {
        System.out.println("Pozivam message source");
        System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        return new ModelAndView("profesor", "command", new Profesor());
    }

    @RequestMapping(value = "/addProfesor", method = RequestMethod.GET)
    public String addProfesor(@ModelAttribute Profesor profesor, ModelMap model) {
        model.addAttribute("ime", profesor.getIme());
        model.addAttribute("prezime", profesor.getPrezime());
        model.addAttribute("oblast", profesor.getOblast());
        return "result";

    }
}
