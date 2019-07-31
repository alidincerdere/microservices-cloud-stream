package com.example.spring.cloud.stream.logger;

/**
 * Created by adere on 24.07.2019.
 */
public class LogDetails {

    public String messageText;

    public LogDetails() {
    }

    public LogDetails(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}

