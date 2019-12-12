package com.demo.engine;

import com.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import org.apache.kafka.clients.consumer.ConsumerRecord;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
   // private KafkaConsumer<String, String> kafkaConsumer;
    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(ConsumerRecord message) throws IOException {
         
       // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+(User)message.value());
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
