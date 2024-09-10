package metodosOrdenacao;

import java.util.Arrays;

public class mergeSort {
    public static void sort(double[] arrAux){
        try {
            if(arrAux == null) throw new NullPointerException("O array esta nulo");

            int start = 0, end = arrAux.length;

            order(arrAux, start, end);

        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante o mergeSort: " + e.getMessage());
        }
    }
    public static void order(double[] array, int start, int end) {
        if (end - start > 1) {
            int middle = (start + end) / 2;
            order(array, start, middle);
            order(array, middle, end);
            merge(array, start, middle, end);
        }
    }

    public static void merge(double[] array, int start, int middle, int end) {
        double[] tempArray = new double[end - start];
        int leftIndex = start;
        int rightIndex = middle;
        int tempIndex = 0;

        while (leftIndex < middle && rightIndex < end) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[tempIndex++] = array[leftIndex++];
            } else {
                tempArray[tempIndex++] = array[rightIndex++];
            }
        }

        while (leftIndex < middle) {
            tempArray[tempIndex++] = array[leftIndex++];
        }

        while (rightIndex < end) {
            tempArray[tempIndex++] = array[rightIndex++];
        }

        System.arraycopy(tempArray, 0, array, start, tempArray.length);
    }
}
