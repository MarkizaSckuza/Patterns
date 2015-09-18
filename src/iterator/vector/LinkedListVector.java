package iterator.vector;


import iterator.exceptions.IncompatibleVectorSizesException;
import iterator.exceptions.VectorIndexOutOfBoundsException;

public class LinkedListVector implements Vector, Cloneable {

    private int size;

    private Node head;

    public LinkedListVector() {
        resetHead();
    }

    public void addElement(Double d) {
        Node newLast = new Node(d);
        newLast.prev = head.prev;
        newLast.next = head;
        head.prev.next = newLast;
        head.prev = newLast;

        size++;
    }

    public void remove(int i) {
        Node curNode = getNode(i);

        Node nextNode = curNode.next;
        Node prevNode = curNode.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size--;
    }

    @Override
    public double getElement(int i) {
        return getNode(i).element;
    }

    @Override
    public void setElement(int i, double value) {
        Node curNode = getNode(i);
        curNode.element = value;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void fillFromMass(double[] mass) {
        resetHead();

        for (double d : mass) {
            addElement(d);
        }
    }

    @Override
    public void fillFromVector(Vector vector) {
        resetHead();

        for (int i = 0; i < vector.getSize(); i++) {
            addElement(vector.getElement(i));
        }
    }

    @Override
    public void mult(double n) {
        Node curNode = head.next;
        for (int i = 0; i < getSize(); i++) {
            curNode.element *= n;
            curNode = curNode.next;
        }
    }

    @Override
    public void sum(Vector vector) throws IncompatibleVectorSizesException {
        if (getSize() != vector.getSize())
            throw new IncompatibleVectorSizesException();

        Node curNode = head.next;
        for (int i = 0; i < getSize(); i++) {
            curNode.element += vector.getElement(i);
            curNode = curNode.next;
        }

    }

    @Override
    public boolean equal(Vector vector) {
        return equals(vector);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (!(o instanceof Vector)) return false;

        Vector vector = (Vector) o;

        if (getSize() != vector.getSize()) return false;

        Node curNode = head.next;
        for (int i = 0; i < getSize(); i++) {
            if (curNode.element != vector.getElement(i))
                return false;
            curNode = curNode.next;
        }

        return true;
    }

    @Override
    public int hashCode() {
        double sum = 0;

        Node curNode = head.next;
        for (int i = 0; i < getSize(); i++) {
            sum += curNode.element;
            curNode = curNode.next;
        }

        return (int) (sum / getSize());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LinkedListVector clonedVector = (LinkedListVector) super.clone();
        clonedVector.resetHead();

        Node curNode = head.next;
        for (int i = 0; i < getSize(); i++) {
            clonedVector.addElement(curNode.element);
            curNode = curNode.next;
        }

        return clonedVector;
    }

    @Override
    public String toString() {
        Node curNode = head.next;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(curNode.element).append(" ");
            curNode = curNode.next;
        }

        return sb.toString();
    }
    
    private void resetHead() {
        size = 0;
        head = new Node(null);
        head.next = head;
        head.prev = head;
    }

    private Node getNode(int i) {
        if ((i > size && i != 0) || i < 0)
            throw new VectorIndexOutOfBoundsException();

        Node curNode = head.next;
        for (int j = 0; j < i; j++) {
            curNode = curNode.next;
        }

        return curNode;
    }

    private class Node {

        private Double element;
        private Node next;
        private Node prev;

        private Node(Double element) {
            this.element = element;
        }
    }
}
