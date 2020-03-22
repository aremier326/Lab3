package com.lab3.main.task1;

/**
 * Simple class for solving one formula.
 *
 * @author Artem Meniak
 * @version 1.0
 */
public class Formula {
    /** {@code x} variable*/
    private double x;
    /** {@code y} variable*/
    private double y;
    /** {@code z} variable*/
    private double z;
    /** {@code result} variable*/
    private double result;


    /**
     * Method for setting variables.
     * @param x
     * @param y
     * @param z
     */
    public void set(double x, double y, double z) {
        if (x == 0) {
            throw new IllegalArgumentException("'x' can not be 0");
        } else if (y - x == 0) {
            throw new IllegalArgumentException("'y - x' can not be 0");
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }


    /**
     * Method for solving the formula.
     */
    public void run() {
        result = Math.abs(Math.pow(x, y / x) - Math.pow(y / x, 1 / 3)) +
                (y - x) * (Math.cos(y) - z / (y - x)) / (1 + Math.pow(y - x, 2));
    }

    /**
     * Method for printing the result of formula.
     */
    public void print() {
        System.out.printf("The result is: %.4f %n", result);
    }
}
