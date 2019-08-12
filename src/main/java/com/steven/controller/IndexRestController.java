package com.steven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRestController {

    @RequestMapping(value = "/indexRest")
    public String index() {
        return "indexRest";
    }

}
