package edu.handong.csee.java.hw2.util;

/**
 * This class is providing check Inputs methods.
 */
public class InputChecker {

    /**
     * This class outputs an error message if the number of numbers required is
     * different.
     * 
     * @param engineName          The name of the function you want to compute.
     * @param numOfRequiredInputs The number(s) entered by the user.
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName,
            int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * This class outputs an error message if there are fewer than the required
     * number of numbers.
     * 
     * @param engineName          The name of the function you want to compute.
     * @param numOfRequiredInputs The number(s) entered by the user.
     */
    public static void printErrorMesssageForMinimumRequiredInputsAndExit(String engineName,
            int numOfRequiredInputs) {
        System.out.println(
                "You need at least " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * 
     * This class outputs an error message if a negative number is entered.
     * 
     * @param engineName The name of the function you want to compute.
     */
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName) {
        System.out.println(
                "The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
