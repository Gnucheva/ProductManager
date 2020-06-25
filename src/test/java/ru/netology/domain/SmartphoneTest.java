package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(6, "Sixth", 600, "MSixth");

    @Test
    void shouldMatchesByName() {
        String text = "Sixth";
        smartphone.matches(text);
        assertTrue(smartphone.matches(text));

    }

    @Test
    void shouldMatchByMaker() {
        String text = "MSixth";
        smartphone.matches(text);
        assertTrue(smartphone.matches(text));
    }

    @Test
    void shouldMatchesByNameInvalid() {
        String text = "Seventh";
        smartphone.matches(text);
        assertFalse(smartphone.matches(text));
    }

    @Test
    void shouldMatchByMakerInvalid() {
        String text = "MSeventh";
        smartphone.matches(text);
        assertFalse(smartphone.matches(text));
    }

}
