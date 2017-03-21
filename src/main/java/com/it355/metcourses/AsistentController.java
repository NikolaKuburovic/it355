package com.it355.metcourses;

import com.it355.metcourses.dao.AsistentDao;
import com.it355.metcourses.service.AsistentService;
import com.it355.model.Asistent;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    AsistentDao asistentDao;

    @Autowired
    AsistentService asistentService;

    @RequestMapping(value = "/asistent", method = RequestMethod.GET)
    public ModelAndView asistenti(ModelAndView modelAndView) {
        System.out.println("Pozivam message source za asistente");
        System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        List<Asistent> asistenti = asistentService.getAllAsistent();
        modelAndView.addObject("asistenti", asistenti);
        modelAndView.setViewName("asistent");
        return modelAndView;
    }

    @RequestMapping(value = "/addasistent", method = RequestMethod.GET)
    public String addAsistent(Model model) {
        model.addAttribute("asistent", new Asistent());
        return "addasistent";
    }

    @RequestMapping(value = "/addasistent", method = RequestMethod.POST)
    public ModelAndView addAsistent(@ModelAttribute("asistent") Asistent a) {
        asistentService.addAsistent(a);
        return new ModelAndView("redirect:/asistent");
    }

    @RequestMapping(value = "/editasistent/{id}", method = RequestMethod.GET)
    public String editAsistent(@PathVariable int id, Model model) {
        Asistent asistent = asistentService.getAsistentById(id);
        model.addAttribute("asistent", asistent);
        return "editasistent";
    }

    @RequestMapping(value = "/editasistent/{id}", method = RequestMethod.POST)
    public ModelAndView editAsistent(@ModelAttribute("asistent") Asistent a) {
        asistentService.updateAsistent(a);
        return new ModelAndView("redirect:/asistent");
    }

    @RequestMapping(value = "/deleteAsistent/{id}", method = RequestMethod.GET)
    public ModelAndView deleteAst(@PathVariable int id) {
        asistentService.deleteAsistent(id);
        return new ModelAndView("redirect:/asistent");
    }
}
