package com.zkr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoTest {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world!";
    }
}
