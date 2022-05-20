package com.akhilesh.di.consumer.impl;

import com.akhilesh.di.consumer.Consumer;
import com.akhilesh.di.service.MessageService;

public class MyDIApplication implements Consumer {

    MessageService messageService;


    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }

}
