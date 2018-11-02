package frc.team5234.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpoRateUtilityTest {

    @Test
    void normalize() {
        ExpoRateUtility expoRateUtility = new ExpoRateUtility();

        assertTrue(equalWithPrecision(-1, expoRateUtility.normalize(-1), 6));
        assertTrue(equalWithPrecision(-0.857375, expoRateUtility.normalize(-0.95), 6));
        assertTrue(equalWithPrecision(-0.729, expoRateUtility.normalize(-0.9), 6));
        assertTrue(equalWithPrecision(-0.614125, expoRateUtility.normalize(-0.85), 6));
        assertTrue(equalWithPrecision(-0.512, expoRateUtility.normalize(-0.8), 6));
        assertTrue(equalWithPrecision(-0.421875, expoRateUtility.normalize(-0.75), 6));
        assertTrue(equalWithPrecision(-0.343, expoRateUtility.normalize(-0.7), 6));
        assertTrue(equalWithPrecision(-0.274625, expoRateUtility.normalize(-0.65), 6));
        assertTrue(equalWithPrecision(-0.216, expoRateUtility.normalize(-0.6), 6));
        assertTrue(equalWithPrecision(-0.166375, expoRateUtility.normalize(-0.55), 6));
        assertTrue(equalWithPrecision(-0.125, expoRateUtility.normalize(-0.5), 6));
        assertTrue(equalWithPrecision(-0.091125, expoRateUtility.normalize(-0.45), 6));
        assertTrue(equalWithPrecision(-0.064, expoRateUtility.normalize(-0.4), 6));
        assertTrue(equalWithPrecision(-0.042875, expoRateUtility.normalize(-0.35), 6));
        assertTrue(equalWithPrecision(-0.027, expoRateUtility.normalize(-0.3), 6));
        assertTrue(equalWithPrecision(-0.015625, expoRateUtility.normalize(-0.25), 6));
        assertTrue(equalWithPrecision(-0.008, expoRateUtility.normalize(-0.2), 6));
        assertTrue(equalWithPrecision(-0.003375, expoRateUtility.normalize(-0.15), 6));
        assertTrue(equalWithPrecision(-0.001, expoRateUtility.normalize(-0.1), 6));
        assertTrue(equalWithPrecision(-0.000125, expoRateUtility.normalize(-0.05), 6));
        assertTrue(equalWithPrecision(0, expoRateUtility.normalize(0), 6));
        assertTrue(equalWithPrecision(0.000125, expoRateUtility.normalize(0.05), 6));
        assertTrue(equalWithPrecision(0.001, expoRateUtility.normalize(0.1), 6));
        assertTrue(equalWithPrecision(0.003375, expoRateUtility.normalize(0.15), 6));
        assertTrue(equalWithPrecision(0.008, expoRateUtility.normalize(0.2), 6));
        assertTrue(equalWithPrecision(0.015625, expoRateUtility.normalize(0.25), 6));
        assertTrue(equalWithPrecision(0.027, expoRateUtility.normalize(0.3), 6));
        assertTrue(equalWithPrecision(0.042875, expoRateUtility.normalize(0.35), 6));
        assertTrue(equalWithPrecision(0.064, expoRateUtility.normalize(0.4), 6));
        assertTrue(equalWithPrecision(0.091125, expoRateUtility.normalize(0.45), 6));
        assertTrue(equalWithPrecision(0.125, expoRateUtility.normalize(0.5), 6));
        assertTrue(equalWithPrecision(0.166375, expoRateUtility.normalize(0.55), 6));
        assertTrue(equalWithPrecision(0.216, expoRateUtility.normalize(0.6), 6));
        assertTrue(equalWithPrecision(0.274625, expoRateUtility.normalize(0.65), 6));
        assertTrue(equalWithPrecision(0.343, expoRateUtility.normalize(0.7), 6));
        assertTrue(equalWithPrecision(0.421875, expoRateUtility.normalize(0.75), 6));
        assertTrue(equalWithPrecision(0.512, expoRateUtility.normalize(0.8), 6));
        assertTrue(equalWithPrecision(0.614125, expoRateUtility.normalize(0.85), 6));
        assertTrue(equalWithPrecision(0.729, expoRateUtility.normalize(0.9), 6));
        assertTrue(equalWithPrecision(0.857375, expoRateUtility.normalize(0.95), 6));
        assertTrue(equalWithPrecision(1, expoRateUtility.normalize(1), 6));
    }

    /**
     * Test double equality based on a giving floating point precision
     *
     * @param a
     * @param b
     * @param precision
     * @return
     */
    private boolean equalWithPrecision(double a, double b, int precision) {
        return Math.abs(a - b) <= Math.pow(10, -precision);
    }
}