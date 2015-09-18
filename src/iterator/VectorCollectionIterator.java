package iterator;

import java.util.Iterator;

/**
 * Created by Margo on 18.09.2015.
 */
public class VectorCollectionIterator<E> implements Iterator<E> {

    private E[] elements;
    private int position;

    public VectorCollectionIterator(E[] elements) {
        this.elements = elements;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= elements.length || elements[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public E next() {
        E element = elements[position];
        position++;
        return element;
    }


}
