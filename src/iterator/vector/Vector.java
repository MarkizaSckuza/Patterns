package iterator.vector;

import iterator.exceptions.IncompatibleVectorSizesException;
import java.io.Serializable;

public interface Vector extends Serializable {

    double getElement(int i);

    void setElement(int i, double value);

    int getSize();

    void fillFromMass(double[] mass);

    void fillFromVector(Vector vector);

    void mult(double n);

    void sum(Vector vector) throws IncompatibleVectorSizesException;

    boolean equal(Vector vector);
}
