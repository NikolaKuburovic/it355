/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.metcourses;

/**
 *
 * @author Nikola Kuburovic
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class PrvaStranaController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "Добро дошли на страну МетКурсеви!");
        model.addAttribute("predmet", "IT355 Веб Системи 2");
        model.addAttribute("student", "Никола Кубуровић 1095");
        return "pozdrav";
    }

}
