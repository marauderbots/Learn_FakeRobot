package frc.team5234.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadbandUtilityTest {

    @Test
    void normalize() {
        DeadbandUtility deadbandUtility = new DeadbandUtility();

        assertEquals(-1, deadbandUtility.normalize(-1));
        assertEquals(-0.95, deadbandUtility.normalize(-0.95));
        assertEquals(-0.9, deadbandUtility.normalize(-0.9));
        assertEquals(-0.85, deadbandUtility.normalize(-0.85));
        assertEquals(-0.8, deadbandUtility.normalize(-0.8));
        assertEquals(-0.75, deadbandUtility.normalize(-0.75));
        assertEquals(-0.7, deadbandUtility.normalize(-0.7));
        assertEquals(-0.65, deadbandUtility.normalize(-0.65));
        assertEquals(-0.6, deadbandUtility.normalize(-0.6));
        assertEquals(-0.55, deadbandUtility.normalize(-0.55));
        assertEquals(-0.5, deadbandUtility.normalize(-0.5));
        assertEquals(-0.45, deadbandUtility.normalize(-0.45));
        assertEquals(-0.4, deadbandUtility.normalize(-0.4));
        assertEquals(-0.35, deadbandUtility.normalize(-0.35));
        assertEquals(-0.3, deadbandUtility.normalize(-0.3));
        assertEquals(-0.25, deadbandUtility.normalize(-0.25));
        assertEquals(-0.2, deadbandUtility.normalize(-0.2));
        assertEquals(0, deadbandUtility.normalize(-0.15));
        assertEquals(0, deadbandUtility.normalize(-0.1));
        assertEquals(0, deadbandUtility.normalize(-0.05));
        assertEquals(0, deadbandUtility.normalize(0));
        assertEquals(0, deadbandUtility.normalize(0.05));
        assertEquals(0, deadbandUtility.normalize(0.1));
        assertEquals(0, deadbandUtility.normalize(0.15));
        assertEquals(0.2, deadbandUtility.normalize(0.2));
        assertEquals(0.25, deadbandUtility.normalize(0.25));
        assertEquals(0.3, deadbandUtility.normalize(0.3));
        assertEquals(0.35, deadbandUtility.normalize(0.35));
        assertEquals(0.4, deadbandUtility.normalize(0.4));
        assertEquals(0.45, deadbandUtility.normalize(0.45));
        assertEquals(0.5, deadbandUtility.normalize(0.5));
        assertEquals(0.55, deadbandUtility.normalize(0.55));
        assertEquals(0.6, deadbandUtility.normalize(0.6));
        assertEquals(0.65, deadbandUtility.normalize(0.65));
        assertEquals(0.7, deadbandUtility.normalize(0.7));
        assertEquals(0.75, deadbandUtility.normalize(0.75));
        assertEquals(0.8, deadbandUtility.normalize(0.8));
        assertEquals(0.85, deadbandUtility.normalize(0.85));
        assertEquals(0.9, deadbandUtility.normalize(0.9));
        assertEquals(0.95, deadbandUtility.normalize(0.95));
        assertEquals(1, deadbandUtility.normalize(1));
    }
}