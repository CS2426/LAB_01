package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {

    private static final String TESTNAME1="TJ";
    private static final String TESTNAME2="Wendy";
    private Learning TJ;
    private Learning Wendy;

    @BeforeEach
    void setUp() {
        TJ = new Learning();
        Wendy = new Learning("Wendy");
        assertNotEquals(TJ,Wendy);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        assertEquals(TESTNAME1,TJ.getName());
        assertEquals(TESTNAME2,Wendy.getName());
    }

    @Test
    void setName() {
        assertNotEquals(TESTNAME2,TJ.getName());
        assertNotEquals(TESTNAME1,Wendy.getName());


    }
}