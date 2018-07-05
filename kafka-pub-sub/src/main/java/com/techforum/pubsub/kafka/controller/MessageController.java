package com.techforum.pubsub.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    Logger LOG = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/message")
    public void message(@RequestParam("content") String message){
        System.out.println("####CONTROLLER###");
    }
}
