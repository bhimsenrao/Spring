package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;  
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
@RequestMapping("/view1")
public String sendData(@RequestParam("uname") String un,@RequestParam("pword")String pw, Model model){
	
if(un.equals("admin") && pw.equals("admin"))	
{	model.addAttribute("username",un);
	return "page1";
}
	else {
	model.addAttribute("username","Invalid");
  return "page2";
}
}
@RequestMapping("/view2")
public String receiveData(HttpServletRequest request, Model model) {
	
	model.addAttribute("username", request.getParameter("tname"));
	return "page2";
}

}
