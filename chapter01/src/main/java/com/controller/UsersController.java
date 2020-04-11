package com.controller;

import javax.annotation.Resource;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Users;
import com.service.UsersService;

@Controller
public class UsersController {
	
	@Resource
    private UsersService usersService;
    
	@RequestMapping("/find.action")
    public String find(Model model){
        Users users =  usersService.find(1);
        System.out.println(users.getUsername());
        model.addAttribute("users",users);
        return "login";
    }
}
