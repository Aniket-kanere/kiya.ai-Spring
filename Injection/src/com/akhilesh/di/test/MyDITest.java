package com.akhilesh.di.test;

import com.akhilesh.di.consumer.Consumer;
import com.akhilesh.di.injector.MessageServiceInjector;
import com.akhilesh.di.injector.impl.EmailServiceInjector;
import com.akhilesh.di.injector.impl.SMSServiceInjector;

public class MyDITest {

    public static void  main(String args[]){
       // Initializing consumer & injector
        MessageServiceInjector messageServiceInjector = null;
        Consumer consumer = null;

        // logic send an email

        messageServiceInjector = new EmailServiceInjector();
        consumer= messageServiceInjector.getConsumer();
        consumer.processMessage("hello", "akhileshpande@gmail.com");

        // send sms

        messageServiceInjector = new SMSServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage("Hi", "999999999");

    }
}
