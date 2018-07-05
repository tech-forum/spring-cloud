package com.techforum.pubsub.kafka.coresubscriber.listener;

import com.techforum.pubsub.kafka.coresubscriber.service.MessageService;
import com.techforum.pubsub.kafka.coresubscriber.config.TechforumStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageSubscriber {
    Logger LOG = LoggerFactory.getLogger(MessageSubscriber.class);

    private MessageService messageService;

    @Autowired
    public MessageSubscriber(MessageService messageService) {
        this.messageService = messageService;
    }

    @StreamListener(TechforumStream.INPUT)
    public void onMessage(Message message){
        byte[] payload = (byte[]) message.getPayload();
        LOG.info("inside subscriber :: payload : {}", new String(payload));
        this.messageService.handleMessage();
    }
}
