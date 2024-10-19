package com.pattern;

public class PoliceCarAdapter extends CarController {
    private PoliceSound policeSound;
    private PoliceLamp lamp;

    public PoliceCarAdapter() {
        policeSound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        policeSound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
