package frc.team5234.utilities;

import java.text.MessageFormat;

public class DeadbandUtility {

    /**
     * Declare our deadband zone as a constant
     */
    protected static final double DEADBAND_ZONE = 0.15;

    /**
     * Our DeadbandUtility constructor
     * Don't put anything in here, it makes testing the code more difficult
     */
    public DeadbandUtility() {
        init();
    }

    /**
     * Construct the utility here
     */
    private void init() {
    }

    /**
     * Our periodic function
     * This method is intended to run frequently.
     */
    public void periodic() {
        double inputValue = Math.random();
        double normalizedValue = normalize(inputValue);

        System.out.println(MessageFormat.format(
                "DeadbandUtility - Input: {0}, Normalized: {1}",
                inputValue,
                normalizedValue));
    }

    /**
     * Given any input, if the value is withing the deadband zone it will return zero, otherwise original input
     * @param inputValue
     * @return
     */
    protected double normalize(double inputValue) {
        return (Math.abs(inputValue) <= DEADBAND_ZONE) ? 0 : inputValue;
    }
}
