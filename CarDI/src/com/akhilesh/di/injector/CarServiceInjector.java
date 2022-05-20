package com.akhilesh.di.injector;

import com.akhilesh.di.consumer.CarConsumer;

public interface CarServiceInjector {
    CarConsumer getCarConsumer();
}
