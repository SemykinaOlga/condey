package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }


    public void increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature >= maxTemperature) {
            this.currentTemperature = currentTemperature;
        }
        else currentTemperature = currentTemperature + 1;
        this.currentTemperature = currentTemperature;
    }
    public void decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature <= minTemperature) {
            this.currentTemperature = currentTemperature;
        }
        else currentTemperature = currentTemperature - 1;
        this.currentTemperature = currentTemperature;
    }
}
