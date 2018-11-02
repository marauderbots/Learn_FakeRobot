package frc.team5234.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopPrintUtilityTest {

    @Test
    void getLastLoopInterval() {
        LoopPrintUtility lpr = new LoopPrintUtility();

        long currentLoopTime = System.currentTimeMillis();
        long lastLoopTime = currentLoopTime - 200;

        assertEquals((currentLoopTime - lastLoopTime), lpr.getLastLoopInterval(currentLoopTime, lastLoopTime));
    }

    @Test
    void getLifeInterval() {
        LoopPrintUtility lpr = new LoopPrintUtility();

        long currentLoopTime = System.currentTimeMillis();

        assertEquals((currentLoopTime - lpr.startTime), lpr.getLifeInterval(currentLoopTime, lpr.startTime));
    }
}