package frc.team5234.utilities;

import java.text.MessageFormat;

public class ExpoRateUtility {

    /**
     * Declare our deadband zone as a constant
     */
    protected static final int EXPONENT = 3;

    /**
     * Our ExpoRateUtility constructor
     * Don't put anything in here, it makes testing the code more difficult
     */
    public ExpoRateUtility() {
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
                "ExpoRateUtility - Input: {0}, Normalized: {1}",
                inputValue,
                normalizedValue));
    }

    /**
     * Given any input, return power based on the configured exponent
     * @param inputValue
     * @return
     */
    protected double normalize(double inputValue) {
        return Math.pow(inputValue, EXPONENT);
    }
}
