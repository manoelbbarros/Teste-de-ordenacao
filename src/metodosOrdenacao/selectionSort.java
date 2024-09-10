package metodosOrdenacao;

import java.util.Arrays;

public class selectionSort {
    public static void sort(double[] arrAux){
        try {
            if(arrAux == null) throw new NullPointerException("O array esta nulo");

            for (int index = 0; index < arrAux.length-1; index++) {
                int minorIndex = index;
                for (int secondIndex = index + 1; secondIndex < arrAux.length; secondIndex++) {
                    if (arrAux[minorIndex] > arrAux[secondIndex]) {
                        minorIndex = secondIndex;
                    }
                }
                double temp = arrAux[minorIndex];
                arrAux[minorIndex] = arrAux[index];
                arrAux[index] = temp;
            }
        } catch (NullPointerException e) {
            System.out.println("Err: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro durante o selectionSort: " + e.getMessage());
        }
    }
}
