package edu.handong.csee.java.hw2.engines;

/**
 * This interface provides commonly needed methods.
 */
public interface Computable {
    /**
     * This is the initial setup process.
     * 
     * @param args These parameters point to the engineName and number(s) as
     *             arguments entered when running the program.
     */
    public void setInput(String[] args);

    /**
     * This is the process of making calculations.
     */
    public void compute();

    /**
     * This is the process of getter the result.
     * 
     * @return is the stored result value
     */
    public double getResult();
}
