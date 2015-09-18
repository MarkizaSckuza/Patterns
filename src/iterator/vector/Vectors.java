package iterator.vector;

import java.io.*;

public class Vectors {

    public static void sort(Vector vector) {
        int halfSize = vector.getSize() / 2;
        int size = vector.getSize();
        for (int i = 0; i < halfSize + 1; i++) {
            int[] minMax = getIndexesOfMinMaxElement(vector, i, size - i - 1);
            int minInd = minMax[0];
            int maxInd = minMax[1];

            if (i != minInd)
                swap(vector, minInd, i);

            if (size - i - 1 != maxInd)
                swap(vector, maxInd, size - i - 1);
        }
    }

    private static int[] getIndexesOfMinMaxElement(Vector vector, int startInd, int endInd) {
        int minInd = startInd;
        int maxInd = startInd;

        for (int i = startInd + 1; i <= endInd; i++) {
            if (vector.getElement(i) < vector.getElement(minInd))
                minInd = i;
            else if (vector.getElement(i) > vector.getElement(maxInd)) {
                maxInd = i;
            }
        }

        return new int[]{minInd, maxInd};
    }

    public static void swap(Vector vector, int left, int right) {
        double tmp = vector.getElement(left);
        vector.setElement(left, vector.getElement(right));
        vector.setElement(right, tmp);
    }

    public static void outputVector(Vector v, OutputStream out) {
        DataOutputStream data = new DataOutputStream(out);

        try {
            data.writeInt(v.getSize());

            for (int i = 0; i < v.getSize(); i++) {
                data.writeDouble(v.getElement(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Vector inputVector(InputStream in) {
        DataInputStream data = new DataInputStream(in);

        Vector v = null;
        try {
            v = new ArrayVector(data.readInt());

            for (int i = 0; i < v.getSize(); i++) {
                v.setElement(i, data.readDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return v;
    }

    public static Vector readVector(Reader in) {
        StreamTokenizer tokenizer = new StreamTokenizer(in);
        Vector v = null;
        try {
            tokenizer.nextToken();
            v = new ArrayVector((int)tokenizer.nval);
            for (int i = 0; tokenizer.nextToken() != StreamTokenizer.TT_EOF; i++) {
                if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    v.setElement(i, tokenizer.nval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return v;
    }

    public static void writeVector(Vector v, Writer out) {
        if (v != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(v.getSize()).append(" ");
            for (int i = 0; i < v.getSize(); i++) {
                sb.append(v.getElement(i)).append(" ");
            }
            System.out.println(sb);
            try {
                out.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
