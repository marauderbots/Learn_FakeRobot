package frc.team5234.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadbandUtilityTest {

    @Test
    void normalize() {
        DeadbandUtility deadbandUtility = new DeadbandUtility();

        assertEquals(deadbandUtility.normalize(-1),-1);
        assertEquals(deadbandUtility.normalize(-0.95),-0.95);
        assertEquals(deadbandUtility.normalize(-0.9),-0.9);
        assertEquals(deadbandUtility.normalize(-0.85),-0.85);
        assertEquals(deadbandUtility.normalize(-0.8),-0.8);
        assertEquals(deadbandUtility.normalize(-0.75),-0.75);
        assertEquals(deadbandUtility.normalize(-0.7),-0.7);
        assertEquals(deadbandUtility.normalize(-0.65),-0.65);
        assertEquals(deadbandUtility.normalize(-0.6),-0.6);
        assertEquals(deadbandUtility.normalize(-0.55),-0.55);
        assertEquals(deadbandUtility.normalize(-0.5),-0.5);
        assertEquals(deadbandUtility.normalize(-0.45),-0.45);
        assertEquals(deadbandUtility.normalize(-0.4),-0.4);
        assertEquals(deadbandUtility.normalize(-0.35),-0.35);
        assertEquals(deadbandUtility.normalize(-0.3),-0.3);
        assertEquals(deadbandUtility.normalize(-0.25),-0.25);
        assertEquals(deadbandUtility.normalize(-0.2),-0.2);
        assertEquals(deadbandUtility.normalize(-0.15),0);
        assertEquals(deadbandUtility.normalize(-0.1),0);
        assertEquals(deadbandUtility.normalize(-0.05),0);
        assertEquals(deadbandUtility.normalize(0),0);
        assertEquals(deadbandUtility.normalize(0.05),0);
        assertEquals(deadbandUtility.normalize(0.1),0);
        assertEquals(deadbandUtility.normalize(0.15),0);
        assertEquals(deadbandUtility.normalize(0.2),0.2);
        assertEquals(deadbandUtility.normalize(0.25),0.25);
        assertEquals(deadbandUtility.normalize(0.3),0.3);
        assertEquals(deadbandUtility.normalize(0.35),0.35);
        assertEquals(deadbandUtility.normalize(0.4),0.4);
        assertEquals(deadbandUtility.normalize(0.45),0.45);
        assertEquals(deadbandUtility.normalize(0.5),0.5);
        assertEquals(deadbandUtility.normalize(0.55),0.55);
        assertEquals(deadbandUtility.normalize(0.6),0.6);
        assertEquals(deadbandUtility.normalize(0.65),0.65);
        assertEquals(deadbandUtility.normalize(0.7),0.7);
        assertEquals(deadbandUtility.normalize(0.75),0.75);
        assertEquals(deadbandUtility.normalize(0.8),0.8);
        assertEquals(deadbandUtility.normalize(0.85),0.85);
        assertEquals(deadbandUtility.normalize(0.9),0.9);
        assertEquals(deadbandUtility.normalize(0.95),0.95);
        assertEquals(deadbandUtility.normalize(1),1);
    }
}