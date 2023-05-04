package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This class is the LCMEngine for doing calculate the LCM two numbers.
 * 
 */
public class LCMEngine implements Computable {
    private static final String engineName = "LCM";
    private int result = 0;
    private int a[];

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
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * This is getter of number list
     * 
     * @return is the stored array value.
     */
    public int[] getA() {
        return a;
    }

    /**
     * This is setter of number list
     * 
     * @param a is the array value that the user wants to store
     */
    public void setA(int[] a) {
        this.a = a;
    }

    /**
     * This is the method of setting Inputs.
     * 
     * @param args These parameters point to the engineName and number(s) as
     *             arguments entered when running the program.
     */
    public void setInput(String[] args) {

        int count = 0;
        int negativeCount = 0;
        for (int i = 1; i < args.length; i++) {
            count++;
            if (Integer.parseInt(args[i]) < 0) {
                negativeCount++;
            }
        }

        if (count < 2) {
            InputChecker.printErrorMesssageForMinimumRequiredInputsAndExit(engineName, 2);
        }
        if (negativeCount > 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }

        a = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
        }
    }

    /**
     * This is the method of computing values.
     */
    public void compute() {

        int max = 0;
        for (int number : a) {
            if (number > max) {
                max = number;
            }
        }

        int lcm = max;
        boolean found = false;
        while (!found) {
            found = true;
            for (int number : a) {
                if (number != 0 && (lcm % number) != 0) {
                    found = false;
                    break;
                }
            }
            if (!found) {
                lcm += max;
            }
        }
        result = lcm;
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