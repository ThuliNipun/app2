package com.bootcamp.demo;

public class Rohitha implements Mahinda{

    private IMFService imfService;

    public Rohitha(IMFService imfService) {
        this.imfService = imfService;
    }

    public String steal() {
        return "Rohitha steal (50000USD)";
    }

    @Override
    public String planningLoan() {
        return imfService.askingMoney();
    }
}
