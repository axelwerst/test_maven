package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
class WagenTest {

    @Test
    void shouldReturnProbeg() {
        //given
        Wagen wagen = new Wagen(35);
        //wen
        float BAK = wagen.BAK();
        float probeg = wagen.probeg();
        System.out.println(probeg);
        System.out.println(BAK);
        //then
        assertEquals(500.0f,probeg);
        assertEquals(70.0f,BAK);
    }

    @Test
    void shouldReturnBAK() {

    }
}