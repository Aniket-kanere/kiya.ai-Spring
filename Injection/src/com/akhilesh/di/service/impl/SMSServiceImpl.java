package com.akhilesh.di.service.impl;

import com.akhilesh.di.service.MessageService;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with Message "+ message);
    }
}
