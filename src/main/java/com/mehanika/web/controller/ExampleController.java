/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mehanika.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mehanika
 */
@Controller
public class ExampleController {

    @Value("${fake.db.name}")
    private String databaseName;
    
    @RequestMapping("/hello")
    public @ResponseBody
    String hello() {
        return "Hello World";
    }

    @RequestMapping("/environmentTest")

    public @ResponseBody
    String databaseName() {

        return databaseName;
    }

    @RequestMapping("/exception")

    public @ResponseBody
    String exception() {
        throw new RuntimeException("It's broken");
    }
}
