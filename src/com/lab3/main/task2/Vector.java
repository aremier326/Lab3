package com.lab3.main.task2;

/**
 * Simple vector class.
 *
 * @author Artem Meniak
 * @version 1.0
 */
public class Vector {
    /**
     * Size of vector
     */
    private int dimension;

    /**
     * Array for storing vector
     */
    private double[] array;

    /**
     * Constructor for creating vector with defined size.
     *
     * @param dimension size of vector.
     * @see Vector#Vector(double...)
     */
    public Vector(int dimension) {
        this.dimension = dimension;
        array = new double[dimension];
    }


    /**
     * Constructor for creationg vector with defined elements.
     *
     * @param array elements of new vector.
     * @see Vector#Vector(int)
     */
    public Vector(double... array) {
        this(array.length);

        for (int i = 0; i < dimension; i++) {
            this.array[i] = array[i];
        }
    }


    /**
     * Method for getting element by index.
     *
     * @param index index of the wanted element.
     * @return element on {@code index} index.
     * @throws IndexOutOfBoundsException if {@code index}
     *                                   is out of bounds of vector.
     */
    public double getElement(int index) throws IndexOutOfBoundsException {
        if (index > dimension || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        return this.array[index];
    }


    /**
     * Method for setting element at {@code index} index.
     *
     * @param index index of the element.
     * @param value value of new element.
     * @throws IndexOutOfBoundsException if {@code index}
     *                                   is out of bounds of vector.
     */
    public void setElement(int index, double value) throws IndexOutOfBoundsException {
        if (index > dimension || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        this.array[index] = value;
    }


    /**
     * Method for checking equality of dimensions.
     *
     * @param firstVector  first vector.
     * @param secondVector second vector.
     * @throws IllegalArgumentException if dimensions of vectors are different.
     */
    private static void checkVectorDimensions(Vector firstVector, Vector secondVector) throws IllegalArgumentException {
        if (firstVector.dimension != secondVector.dimension) {
            throw new IllegalArgumentException("Dimensions are different!");
        }
    }


    /**
     * Method for adding two vectors.
     *
     * @param inputVector second vector for adding.
     * @return new {@code Vector} object with added values.
     */
    public Vector add(Vector inputVector) {
        checkVectorDimensions(this, inputVector);

        Vector resultVector = new Vector(dimension);

        for (int i = 0; i < dimension; i++) {
            resultVector.array[i] = this.array[i] + inputVector.array[i];
        }

        return resultVector;
    }


    /**
     * Method for deducting two vectors.
     *
     * @param inputVector second vector for deducting.
     * @return new {@code Vector} object with deducted values.
     */
    public Vector deduct(Vector inputVector) {
        checkVectorDimensions(this, inputVector);

        Vector resultVector = new Vector(dimension);

        for (int i = 0; i < dimension; i++) {
            resultVector.array[i] = this.array[i] - inputVector.array[i];
        }

        return resultVector;
    }

    /**
     * Method for multiplying two vectors.
     *
     * @param inputVector second vector for multiplying.
     * @return new {@code Vector} object with multiplied values.
     */
    public Vector multiply(Vector inputVector) {
        checkVectorDimensions(this, inputVector);

        Vector resultVector = new Vector(dimension);

        for (int i = 0; i < dimension; i++) {
            resultVector.array[i] = this.array[i] * inputVector.array[i];
        }

        return resultVector;
    }


    /**
     * Method for adding two vectors.
     *
     * @param inputVector second vector for adding
     * @return new {@code Vector} object with added values.
     */
    public Vector divide(Vector inputVector) {
        checkVectorDimensions(this, inputVector);

        Vector resultVector = new Vector(dimension);

        for (int i = 0; i < dimension; i++) {
            if(inputVector.array[i] == 0) {
                throw new ArithmeticException("Division by zero!");
            } else {
                resultVector.array[i] = Math.round(this.array[i] / inputVector.array[i]);
            }
        }

        return resultVector;
    }


    /**
     * Overriding of {@code toString()} method.
     *
     * @return string value of vector.
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < this.dimension; i++) {
            if (i != dimension - 1) {
                string.append(this.array[i] + ", ");
            } else {
                string.append(this.array[i]);
            }
        }
        return string.toString();
    }

    /**
     * Method for printing vector.
     */
    public void print() {
        System.out.println(this.toString());
    }
}
