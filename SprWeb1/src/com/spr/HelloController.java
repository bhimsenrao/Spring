package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
	public class HelloController {  
	@RequestMapping("/")  
	    public String display()  
	    {  
	        return "index";  
	    }     
   @RequestMapping("/view1")
   public String map1(){
	   return "page1";
   }	
}  

