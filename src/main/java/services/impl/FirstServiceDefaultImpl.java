package services.impl;

import services.FirstService;

public class FirstServiceDefaultImpl implements FirstService {

    @Override
    public void print() {
        System.out.println("Default First");
    }
}
