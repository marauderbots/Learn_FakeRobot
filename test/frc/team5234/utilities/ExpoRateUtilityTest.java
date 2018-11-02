package frc.team5234.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpoRateUtilityTest {

    @Test
    void normalize() {
        ExpoRateUtility expoRateUtility = new ExpoRateUtility();

        assertEquals(-1, expoRateUtility.normalize(-1));
        assertEquals(-0.857375, expoRateUtility.normalize(-0.95));
        assertEquals(-0.729, expoRateUtility.normalize(-0.9));
        assertEquals(-0.614125, expoRateUtility.normalize(-0.85));
        assertEquals(-0.512, expoRateUtility.normalize(-0.8));
        assertEquals(-0.421875, expoRateUtility.normalize(-0.75));
        assertEquals(-0.343, expoRateUtility.normalize(-0.7));
        assertEquals(-0.274625, expoRateUtility.normalize(-0.65));
        assertEquals(-0.216, expoRateUtility.normalize(-0.6));
        assertEquals(-0.166375, expoRateUtility.normalize(-0.55));
        assertEquals(-0.125, expoRateUtility.normalize(-0.5));
        assertEquals(-0.091125, expoRateUtility.normalize(-0.45));
        assertEquals(-0.064, expoRateUtility.normalize(-0.4));
        assertEquals(-0.042875, expoRateUtility.normalize(-0.35));
        assertEquals(-0.027, expoRateUtility.normalize(-0.3));
        assertEquals(-0.015625, expoRateUtility.normalize(-0.25));
        assertEquals(-0.008, expoRateUtility.normalize(-0.2));
        assertEquals(-0.003375, expoRateUtility.normalize(-0.15));
        assertEquals(-0.001, expoRateUtility.normalize(-0.1));
        assertEquals(-0.000125, expoRateUtility.normalize(-0.05));
        assertEquals(0, expoRateUtility.normalize(0));
        assertEquals(0.000125, expoRateUtility.normalize(0.05));
        assertEquals(0.001, expoRateUtility.normalize(0.1));
        assertEquals(0.003375, expoRateUtility.normalize(0.15));
        assertEquals(0.008, expoRateUtility.normalize(0.2));
        assertEquals(0.015625, expoRateUtility.normalize(0.25));
        assertEquals(0.027, expoRateUtility.normalize(0.3));
        assertEquals(0.042875, expoRateUtility.normalize(0.35));
        assertEquals(0.064, expoRateUtility.normalize(0.4));
        assertEquals(0.091125, expoRateUtility.normalize(0.45));
        assertEquals(0.125, expoRateUtility.normalize(0.5));
        assertEquals(0.166375, expoRateUtility.normalize(0.55));
        assertEquals(0.216, expoRateUtility.normalize(0.6));
        assertEquals(0.274625, expoRateUtility.normalize(0.65));
        assertEquals(0.343, expoRateUtility.normalize(0.7));
        assertEquals(0.421875, expoRateUtility.normalize(0.75));
        assertEquals(0.512, expoRateUtility.normalize(0.8));
        assertEquals(0.614125, expoRateUtility.normalize(0.85));
        assertEquals(0.729, expoRateUtility.normalize(0.9));
        assertEquals(0.857375, expoRateUtility.normalize(0.95));
        assertEquals(1, expoRateUtility.normalize(1));
    }
}