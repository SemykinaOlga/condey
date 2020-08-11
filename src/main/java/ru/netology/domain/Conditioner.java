package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature = currentTemperature - 1;
    }
}
