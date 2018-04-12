package com.boot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping(value = {"/openurl/{openUrl}"}, method = RequestMethod.GET)
    @ResponseBody
    public String search(
            @PathVariable("openUrl") String openUrl) {
        return openUrl;
    }

}
