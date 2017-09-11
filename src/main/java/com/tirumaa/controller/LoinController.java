package com.tirumaa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arjun on 9/6/2017.
 */

@RestController
@RequestMapping("/login")
public class LoinController {
    private static final Logger logger = LoggerFactory.getLogger(LoinController.class);

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.ACCEPTED)
    void isConnected(){
        logger.info("Connected successfully");
    }
}
