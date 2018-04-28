package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DavidChan on 2018/4/28.
 */
@RestController
@RequestMapping("test")
public class citestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return "Hello world!";
    }

}