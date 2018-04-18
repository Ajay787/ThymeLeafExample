package com.app.basic;


import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping("/")
	 public String index() {
       
        return "index"; 
    }
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        List< String> list=new LinkedList<>();
        for(int i=0;i<=15;i++) {
        		list.add("Hello"+i);
        }
        model.addAttribute("list",list);
        return "helloThyme"; 
    }	
}