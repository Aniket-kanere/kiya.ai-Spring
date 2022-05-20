package com.akhilesh.di.service.impl;

import com.akhilesh.di.service.MessageService;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to : "+ receiver+ " with Message "+ message );
    }
}
