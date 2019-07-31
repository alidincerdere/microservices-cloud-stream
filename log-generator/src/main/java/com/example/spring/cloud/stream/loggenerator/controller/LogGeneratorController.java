package com.example.spring.cloud.stream.loggenerator.controller;

import com.example.spring.cloud.stream.loggenerator.model.LogDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 24.07.2019.
 */
@RestController
@EnableBinding(Source.class)
public class LogGeneratorController {


    @Autowired
    private Source source;

    @GetMapping("/logger/{name}")
    public LogDetails getRequest(@PathVariable String name) {



        LogDetails logDetails = new LogDetails("Hello " + name);

        this.source.output().send(MessageBuilder.withPayload(logDetails).build());

        return logDetails;
    }

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name) {

        return "Hello " + name;
    }


}
