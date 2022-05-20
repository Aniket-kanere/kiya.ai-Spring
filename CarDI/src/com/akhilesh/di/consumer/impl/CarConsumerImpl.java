package com.akhilesh.di.consumer.impl;

import com.akhilesh.di.consumer.CarConsumer;
import com.akhilesh.di.service.CarService;

public class CarConsumerImpl implements CarConsumer {

   private CarService carService = null;

    public CarConsumerImpl(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void getCar() {
        carService.model();
    }
}
