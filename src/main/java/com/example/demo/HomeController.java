package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.AttributedString;
@Controller
public class HomeController {
  @RequestMapping("/loadform")
   public String loadFormPage(){
      return "formtemplate";
  }
    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("email") String email, Model model){
      model.addAttribute("emailval",email);
      return "Confirm";

    }

}
