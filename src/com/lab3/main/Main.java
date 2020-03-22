package com.lab3.main;

import com.lab3.main.task1.Formula;
import com.lab3.main.task2.Vector;

public class Main {

    public static void main(String[] args) {
        runFirstTask();
        //runSecondTask(args);
    }


    /**
     * Method for execution of the first task.
     */
    public static void runFirstTask() {
        Formula obj = new Formula();
        obj.set(1.825 * Math.pow(10, 2), 18.225, -3.298 * Math.pow(10, -2));
        obj.run();
        obj.print();

    }


    /**
     * Method for execution of the second task.
     * @param args
     */
    public static void runSecondTask(String[] args) {
        double[] array = new double[args.length];
        for(int i = 0; i < args.length; i++)
        {
            array[i] = Double.parseDouble(args[i]);
        }

        Vector firstVector = new Vector(array[0], array[1], array[2], array[3]);
        Vector secondVector = new Vector(array[4], array[5], array[6], array[7]);

        System.out.println("First vector");
        firstVector.print();
        System.out.println("Second vector");
        secondVector.print();

        Vector thirdVector = firstVector.add(secondVector);
        Vector fourthVector = firstVector.deduct(secondVector);
        Vector fifthVector = secondVector.multiply(firstVector);
        Vector sixthVector = secondVector.divide(firstVector);

        System.out.println("Adding result");
        thirdVector.print();
        System.out.println("Deducting result");
        fourthVector.print();
        System.out.println("Multiplying result");
        fifthVector.print();
        System.out.println("Dividing result");
        sixthVector.print();
    }
}
