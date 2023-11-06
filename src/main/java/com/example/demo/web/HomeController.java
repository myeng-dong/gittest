package com.example.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class HomeController {

  @GetMapping("/")
  public ModelAndView home(){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("home");
    return mv;
  }
}
