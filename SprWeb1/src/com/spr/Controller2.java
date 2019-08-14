package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
@RequestMapping("/view2")
public String showThis() {
return "page2";
}
}
