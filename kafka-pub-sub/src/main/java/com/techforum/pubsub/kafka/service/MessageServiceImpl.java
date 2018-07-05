package com.techforum.pubsub.kafka.service;

import com.techforum.pubsub.kafka.coresubscriber.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public void handleMessage() {
        System.out.println("### INSIDE CLIENT ###");
    }
}
