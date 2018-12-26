package com.huqi.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * @author: huqi
 * @DATE: 2018/12/21
 * @TIME: 7:55 PM
 **/
@Controller
public class DemoController {
    @RequestMapping({"/user/login"})
    public String login(){
        return "home";
    }



    @RequestMapping({"/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/user/me")
    @ResponseBody
    public Principal user(@AuthenticationPrincipal Principal principal){

        return principal;
    }
}
