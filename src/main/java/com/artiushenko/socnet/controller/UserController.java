package com.artiushenko.socnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

@Controller
public class UserController {
    @GetMapping(value = "/")
    public @ResponseBody
    String method() {
        return "Empty page";
    }
}
