package iterator.vector;


import iterator.exceptions.IncompatibleVectorSizesException;
import iterator.exceptions.VectorIndexOutOfBoundsException;

public strictfp class ArrayVector implements Vector {

    private double[] vector;

    public ArrayVector(int size) {
        vector = new double[size];
    }

    @Override
    public double getElement(int i) {
        if (!checkIndex(i))
            throw new VectorIndexOutOfBoundsException();

        return vector[i];
    }

    @Override
    public void setElement(int i, double value) {
        if (!checkIndex(i))
            throw new VectorIndexOutOfBoundsException();

        vector[i] = value;
    }

    @Override
    public int getSize() {
        return vector.length;
    }

    @Override
    public void fillFromMass(double[] vector) {
        if (getSize() != vector.length)
            this.vector = new double[vector.length];

        for (int i = 0; i < getSize(); i++) {
            setElement(i, vector[i]);
        }
    }

    @Override
    public void fillFromVector(Vector vector) {
        if (getSize() != vector.getSize())
            this.vector = new double[vector.getSize()];

        for (int i = 0; i < vector.getSize(); i++) {
            this.setElement(i, vector.getElement(i));
        }
    }

    @Override
    public void mult(double n) {
        for (int i = 0; i < getSize(); i++) {
            setElement(i, getElement(i) * n);
        }
    }

    @Override
    public void sum(Vector v) throws IncompatibleVectorSizesException {
        if (this.getSize() != v.getSize())
            throw new IncompatibleVectorSizesException();

        for (int i = 0; i < getSize(); i++) {
            setElement(i, this.getElement(i) + v.getElement(i));
        }
    }

    @Override
    public boolean equal(Vector vector) {
        if (this == vector) return true;

        if (vector == null) return false;

        if (vector.getSize() != this.getSize()) return false;

        for (int i = 0; i < vector.getSize(); i++) {
            if (this.getElement(i) != vector.getElement(i))
                return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vector && equal((Vector) obj);
    }

    @Override
    public String toString() {
        StringBuilder sbOutput = new StringBuilder();
        for (double value : vector) {
            sbOutput.append(value).append(" ");
        }

        return sbOutput.toString();
    }

    public double getMax() {
        double max = getElement(0);
        for (int i = 1; i < getSize(); i++) {
            if (getElement(i) > max)
                max = getElement(i);
        }

        return max;
    }

    public double getMin() {
        double min = getElement(0);
        for (int i = 1; i < getSize(); i++) {
            if (getElement(i) < min)
                min = getElement(i);
        }

        return min;
    }

    private boolean checkIndex(int i) {
        return i >= 0 && i < getSize();
    }
}