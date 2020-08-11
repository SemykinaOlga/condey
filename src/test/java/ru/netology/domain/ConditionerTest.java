package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldSetNoMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        int expected = 11;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void shouldSetMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentNoMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        int expected = -10;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}