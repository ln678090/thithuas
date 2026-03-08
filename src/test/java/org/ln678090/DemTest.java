package org.ln678090;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dem() {
        Dem dem = new Dem();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(6, dem.dem(arr));
    }
    @Test
    void dem2(){
        Dem dem = new Dem();
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(30, dem.dem(arr));
    }
    @Test
    void dem3(){
        Dem dem = new Dem();
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, dem.dem(arr));
    }
}