package frc.team5234.utilities;

import java.text.MessageFormat;

public class LoopPrintUtility {

    /**
     * A place to hold our incremented loop count.
     */
    protected int loopCounter;

    /**
     * This should never change once set. It holds the time in ms of when this utility was started.
     */
    protected long startTime;

    /**
     * We hold the time in ms of the last loop execution.
     * This is used to calculate both the loop cycle time and utility life.
     */
    protected long lastLoopTime;

    /**
     * Our LoopPrintUtility constructor
     * Don't put anything in here, it makes testing the code more difficult
     */
    public LoopPrintUtility() {
        init();
    }

    /**
     * Construct the utility here
     */
    private void init() {
        loopCounter = 0;
        startTime = System.currentTimeMillis();
    }

    /**
     * Our periodic function
     * This method is intended to run frequently.
     */
    public void periodic() {
        long currentLoopTime = System.currentTimeMillis();

        System.out.println(MessageFormat.format(
                "LoopPrintUtility - Loop: {0}, Time: {1}, Life: {2}",
                loopCounter,
                getLastLoopInterval(currentLoopTime, lastLoopTime),
                getLifeInterval(currentLoopTime, startTime)));

        lastLoopTime = currentLoopTime;
        loopCounter++;
    }

    /**
     * Any logic should always live in a function.
     * Single purpose functions are the easiest to maintain and test
     */

    /**
     * Given the current loop timestamp and the last loop timestamp
     * calculates the number of milliseconds between the two to determine the time since the last loop
     * @param currentLoopTime
     * @param lastLoopTime
     * @return
     */
    protected long getLastLoopInterval(long currentLoopTime, long lastLoopTime) {
        return currentLoopTime - lastLoopTime;
    }

    /**
     * Given the current loop timestamp and the utility start time
     * calculate the number of milliseconds between the two to determine the time this utility has been running
     * @param currentLoopTime
     * @param startTime
     * @return
     */
    protected long getLifeInterval(long currentLoopTime, long startTime) {
        return currentLoopTime - startTime;
    }
}
