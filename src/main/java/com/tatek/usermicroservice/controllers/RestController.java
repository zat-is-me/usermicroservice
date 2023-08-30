package com.tatek.usermicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tatek on 8/30/2023
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/users")
public class RestController {

    @GetMapping("/status")
    public String status(){
        return "<h1>The Application works fine!</h1>";
    }
}
