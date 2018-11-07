package com.techforum.pubsub.kafka.coresubscriber.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

@EnableBinding(TechforumStream.class)
public class StreamsConfig {

}
