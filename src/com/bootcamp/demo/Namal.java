package com.bootcamp.demo;

public class Namal implements Mahinda {

    private IMFService imfService;

    public Namal(IMFService imfService) {
        this.imfService = imfService;
    }

    public String steal() {
        return "Namal steal (50000USD)";
    }

    @Override
    public String planningLoan() {
        return imfService.askingMoney();
    }

}
