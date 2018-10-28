package frc.team5234;

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
    private void initRobot() {
    }

    /**
     * Call your robot module's periodic method here
     */
    protected void periodic() {
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
