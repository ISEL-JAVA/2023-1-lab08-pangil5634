package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This class is the FactorialEngine for doing compute Factorial number.
 */
public class FactorialEngine implements Computable {
    private static final String engineName = "FACTORIAL";
    private double result = 1;
    private int n = 1;

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
     * @param result is the result value that the user wants to store.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is the getter of N.
     * 
     * @return is the stored Number value.
     */
    public int getN() {
        return n;
    }

    /**
     * This is the setter of N.
     * 
     * @param n is the Number value that the user wants to store.
     */
    public void setN(int n) {
        this.n = n;
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
        n = Integer.parseInt(args[1]);
        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    /**
     * This is the method of computing values.
     * 
     */
    public void compute() {
        if (n == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
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
