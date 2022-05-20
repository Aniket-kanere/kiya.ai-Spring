package com.akhilesh.di.service.impl;

import com.akhilesh.di.service.CarService;

public class BrezzaCarServiceImpl implements CarService {
    @Override
    public void model() {
        System.out.println("Brezza Car");
    }
}
