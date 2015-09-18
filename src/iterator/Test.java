package iterator;


import iterator.vector.ArrayVector;
import iterator.vector.LinkedListVector;
import iterator.vector.VectorContainer;
import iterator.vector.vectorContainer.VectorCollection;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        LinkedListVector linkedListVector = new LinkedListVector();
        LinkedListVector linkedListVector2 = new LinkedListVector();
        LinkedListVector linkedListVector3 = new LinkedListVector();
        LinkedListVector linkedListVector4 = new LinkedListVector();
        ArrayVector arrayVector = new ArrayVector(5);
        double[] aL = new double[]{1, 1, 34, 11, 7.5};
        double[] aL2 = new double[]{2, 2, 34, 11, 7.5};
        double[] aL3 = new double[]{3, 3, 34, 11, 7.5};
        double[] aL4 = new double[]{4, 4, 34, 11, 7.5};
        double[] aA = new double[]{0.4, -0.02, 0.34, 0.11, 7.005};
        
        linkedListVector.fillFromMass(aL);
        linkedListVector2.fillFromMass(aL2);
        linkedListVector3.fillFromMass(aL3);
        linkedListVector4.fillFromMass(aL4);
        arrayVector.fillFromMass(aA);

        VectorContainer<LinkedListVector> linkedListContainer = new VectorContainer<LinkedListVector>();
        VectorContainer<LinkedListVector> linkedListContainer2 = new VectorContainer<LinkedListVector>();
        linkedListContainer.add(0, linkedListVector);
        linkedListContainer.add(1, linkedListVector2);
        linkedListContainer.add(2, linkedListVector3);
        linkedListContainer.add(3, linkedListVector4);
        linkedListContainer.add(4, linkedListVector);
        
        linkedListContainer2.add(0, linkedListVector4);

        for (int i = 0; i < linkedListContainer.getSize(); i++) {
            System.out.println(linkedListContainer.getVector(i).toString());
        }
        System.out.println("------------------------------------------");
        linkedListContainer2.add(linkedListContainer);
        for (int i = 0; i < linkedListContainer2.getSize(); i++) {
            System.out.println(linkedListContainer2.getVector(i).toString());
        }

        System.out.println("SECOND ADDITION---------------------------");
        
        linkedListContainer2.add(linkedListContainer);
        for (int i = 0; i < linkedListContainer2.getSize(); i++) {
            System.out.println(linkedListContainer2.getVector(i).toString());
        }
        System.out.println("------------------------------------------");
        linkedListContainer2.remove(1);
        for (int i = 0; i < linkedListContainer2.getSize(); i++) {
            System.out.println(linkedListContainer2.getVector(i).toString());
        }

        System.out.println("------------------------------------------");
        System.out.println(linkedListContainer2.find(linkedListVector3));
        
        linkedListContainer.clear();

        System.out.println();

        VectorCollection<ArrayVector> vectorCollection = new VectorCollection<ArrayVector>();
        vectorCollection.add(arrayVector);
        System.out.println(vectorCollection.toString());

        Iterator iterator = vectorCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
