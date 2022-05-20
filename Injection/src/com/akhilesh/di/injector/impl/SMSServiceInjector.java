package com.akhilesh.di.injector.impl;

import com.akhilesh.di.consumer.Consumer;
import com.akhilesh.di.consumer.impl.MyDIApplication;
import com.akhilesh.di.injector.MessageServiceInjector;
import com.akhilesh.di.service.impl.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
