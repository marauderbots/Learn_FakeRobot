package frc.team5234;

import frc.team5234.utilities.DeadbandUtility;
import frc.team5234.utilities.ExpoRateUtility;
import frc.team5234.utilities.LoopPrintUtility;

/**
 * FakeRobotRunner is a utility class designed for students to use while testing small functions built for a robot.
 *
 * @author Jason Kusnier
 * @version 1.0
 */
public class FakeRobotRunner {

    /**
     * Simulate the roboRIO at 50Hz
     */
    private static final int LOOP_DELAY = 20;

    /**
     * Declare a private variable for your robot modules here
     */
    LoopPrintUtility loopPrintUtility;
    DeadbandUtility deadbandUtility;
    ExpoRateUtility expoRateUtility;

    /**
     * Our FakeRobotRunner constructor
     * Don't put anything in here, it makes testing the code more difficult
     */
    public FakeRobotRunner() {
        initRobot();
    }

    /**
     * Construct your robot modules here
     */
    protected void initRobot() {
        loopPrintUtility = new LoopPrintUtility();
        deadbandUtility = new DeadbandUtility();
        expoRateUtility = new ExpoRateUtility();
    }

    /**
     * Call your robot module's periodic method here
     */
    protected void periodic() {
        loopPrintUtility.periodic();
        deadbandUtility.periodic();
        expoRateUtility.periodic();
    }

    /**
     * Don't change anything in this method
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        FakeRobotRunner robot = new FakeRobotRunner();

        while (!Thread.interrupted()) {
            Thread.sleep(LOOP_DELAY);
            robot.periodic();
        }
    }
}
