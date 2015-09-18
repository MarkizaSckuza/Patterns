package iterator.vector;

/**
 * Created by Margo on 09.08.2015.
 */
public class VectorContainer<T extends Vector> {

    private T[] vectors;
    private int size;

    public VectorContainer() {
//        Object[] array = new Object[10];
//        vectors = (T[]) array;
        vectors = (T[]) new Vector[10];
        size = 0;
    }

    public void add(int i, T vector) {
        this.setVector(i, vector);
        size++;
    }

    public void add(VectorContainer<T> container) {
        if (getCountEmptyCells() < container.getSize()) {
            Object[] array = new Vector[this.vectors.length + container.getSize()];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i < this.getSize()) {
                    array[i] = getVector(i);
                } else {
                    array[i] = container.getVector(j);
                    j++;
                }
            }
            vectors = (T[]) array;
        } else {
            int j = 0;
            for (int i = this.vectors.length - getCountEmptyCells(); i < this.vectors.length; i++) {
                setVector(i, container.getVector(j));   
                j++;
            }
        }
        size = this.vectors.length - getCountEmptyCells();
    }

    public T getVector(int i) {
       return this.vectors[i];
    }

    public void setVector(int i, T vector) {
        this.vectors[i] = vector;
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public T find(T vector) {
        for (int i = 0; i < this.getSize(); i++) {
            if (this.getVector(i).equals(vector))
                return this.getVector(i);
        }
        return null;
    }

    public void remove(int i) {
        T[] array = (T[]) new Vector[this.vectors.length - 1];
        int k = 0;
        for (int j = i + 1; j < this.getSize(); j++) {
            array[k] = this.getVector(j);  
            k++;
        }
        k = 0;
        for (int j = i; j < this.getSize(); j++) {
            this.setVector(j, array[k]);
            k++;
        }   
        size--;
    }

    public void clear() {
        for (int i = 0; i < this.getSize(); i++) {
            setVector(i, null);
        }
        size = 0;
    }

    private int getCountEmptyCells() {
        int count = 0;
        if (getVector(this.vectors.length - 1) != null) {
            return count;
        } else {
            int i = this.vectors.length - 1;
            while (i >= 0 && getVector(i) == null) {
                count++;
                i--;
            }
        }
        return count;
    }

}
