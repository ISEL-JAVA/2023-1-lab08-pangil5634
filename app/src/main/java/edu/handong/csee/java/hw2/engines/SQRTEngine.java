package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This class is the SQRTEngine for doing get the square root.
 */
public class SQRTEngine implements Computable {
    private static final String engineName = "SQRT";
    private double result = 0.0;
    private double input = 0.0;

    /**
     * This is the getter of engineName.
     * 
     * @return is the stored engineName value.
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * This is the setter of result.
     * 
     * @param result is the result value that the user wants to store
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is the getter of Input.
     * 
     * @return is the stored input value.
     */
    public double getInput() {
        return input;
    }

    /**
     * This is the setter of Input.
     * 
     * @param input is the input value that the user wants to store
     */
    public void setInput(double input) {
        this.input = input;
    }

    /**
     * This is the method of setting Inputs.
     * 
     * @param args These parameters point to the engineName and number(s) as
     *             arguments entered when running the program.
     */
    public void setInput(String[] args) {

        int count = 0;
        for (int i = 1; i < args.length; i++) {
            count++;
        }

        if (count != 1) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }

        input = Double.parseDouble(args[1]);
        if (input < 1) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    /**
     * This is the method of computing values.
     */
    public void compute() {
        result = Math.sqrt(input);
    }

    /**
     * This is the getter of result.
     * 
     * @return is the stored result value
     */
    public double getResult() {
        return result;
    }
}
