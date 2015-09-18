package iterator.vector.vectorContainer;

import iterator.vector.Vector;
import iterator.VectorCollectionIterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public class VectorCollection<E extends Vector> implements Collection<E> {

    private E[] elements;
    private int size;

    public VectorCollection() {
        this.elements = (E[]) new Vector[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if (this.elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new VectorCollectionIterator<E>(elements);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size()) {
            return (T[]) Arrays.copyOf(elements, size(), a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size());
        return a;
    }

    @Override
    public boolean add(E e) {
        int i = getCountEmptyCells();
        if (i != 0) {
            this.elements[elements.length - i - 1] = e;
            size++;
            return true;
        }
        E[] array = (E[]) new Vector[elements.length];
        System.arraycopy(elements, 0, array, 0, size);
        array[array.length - 1] = e;
        this.elements = array;
        size = elements.length;
        return true;

    }

    @Override
    public boolean remove(Object o) {
        int i = 0;
        while (!this.elements[i].equals(o)) {
            i++;
        }
        System.arraycopy(this.elements, i + 1, this.elements, i, this.elements.length - i);
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o : c) {
            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[i].equals(o)) {
                    remove(this.elements[i]);
                }
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (Object o : c) {
            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[i].equals(o)) {
                    this.remove(this.elements[i]);
                }
            }
        }
        return true;
    }

    @Override
    public void clear() {
        this.elements = (E[]) new Vector[10];
    }

    private int getCountEmptyCells() {
        int count = 0;
        if (this.elements[elements.length - 1] != null)
            return count;
        int i = this.elements.length - 1;
        while (i >= 0 && this.elements[i] == null) {
            count++;
            i--;
        }
        return count;
    }
}
