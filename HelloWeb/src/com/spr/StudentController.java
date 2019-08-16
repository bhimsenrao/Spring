package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
   @RequestMapping(value = "stud", method = RequestMethod.GET)
   public ModelAndView studentView() {
	   //ModelAndView mv= new ModelAndView("student");
	 //  mv.addObject("command", new Student());
      return new ModelAndView("student","command",new Student());
   }
   @RequestMapping(value = "addStudent", method = RequestMethod.GET)
      public String addStudent(@ModelAttribute("command")Student student, ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      return "result";
   }
}