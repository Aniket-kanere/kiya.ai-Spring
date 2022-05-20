package com.akhilesh.di.injector.impl;

import com.akhilesh.di.consumer.CarConsumer;
import com.akhilesh.di.consumer.impl.CarConsumerImpl;
import com.akhilesh.di.injector.CarServiceInjector;
import com.akhilesh.di.service.impl.EartigaCarServiceImpl;

public class EartigaCarServiceInjector implements CarServiceInjector {
    @Override
    public CarConsumer getCarConsumer() {
        return new CarConsumerImpl(new EartigaCarServiceImpl());
    }
}
