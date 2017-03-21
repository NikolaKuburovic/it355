
package com.it355.metcourses;

/**
 *
 * @author Nikola Kuburovic
 */
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
  
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka1", "Добро дошли на МетКурсеве!");
        model.addAttribute("poruka2", "Ово је страна којој могу сви да приступе!");
        model.addAttribute("predmet", "IT355 Веб Системи 2");
        model.addAttribute("fakultet", "Универзитет Метрополитан");
        return "index";
    }
    
    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public ModelAndView helloPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Сада си пријављен на апликацију!");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Сада си пријављен на апликацију!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Лоши подаци за пријаву!");
        }
        if (logout != null) {
            model.addObject("msg", "Одјавили сте се.");
        }
        model.setViewName("login");
        return model;
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
        ModelAndView model = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            System.out.println(userDetail);
            model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("403");
        return model;
    }
 
}
