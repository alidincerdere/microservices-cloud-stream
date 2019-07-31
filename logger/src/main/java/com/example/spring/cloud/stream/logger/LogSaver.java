package com.example.spring.cloud.stream.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by adere on 24.07.2019.
 */
@EnableBinding(Sink.class)
public class LogSaver {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(Sink.INPUT)
    public void process(LogDetails logDetails) {

        logger.info(logDetails.getMessageText());
    }
}
