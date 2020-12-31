package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/kafka")
public class KafkaWebController {

    private final KafkaSender kafkaSender;
    @Autowired
    public KafkaWebController(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @GetMapping(value = "send")
    public String producer(@RequestParam("message") String message) {
        kafkaSender.send(message);
        return "Message sent to Kafka successfully";
    }
}
