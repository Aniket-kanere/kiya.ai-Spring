package com.akhilesh.di.test;

import com.akhilesh.di.consumer.CarConsumer;
import com.akhilesh.di.injector.CarServiceInjector;
import com.akhilesh.di.injector.impl.BrezzaCarServiceInjector;
import com.akhilesh.di.injector.impl.EartigaCarServiceInjector;

public class CarDITest {
    public static  void main(String args[]){


        CarConsumer consumer= null;
        CarServiceInjector injector = null;

        // get Eartiga Car
        injector = new EartigaCarServiceInjector();
        consumer= injector.getCarConsumer();
        consumer.getCar();


        // get Brezza Car
        injector = new BrezzaCarServiceInjector();
        consumer = injector.getCarConsumer();
        consumer.getCar();
    }
}
