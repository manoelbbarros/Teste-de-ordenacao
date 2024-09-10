package metodosOrdenacao;

import java.util.Arrays;

public class insertionSort {
    public static void sort(double[] arrAux){
        try {
            if(arrAux == null) throw new NullPointerException("O array esta nulo");

            for (int index = 1; index < arrAux.length; index++) {
                double minor = arrAux[index];
                int secondIndex = index - 1;

                while (secondIndex >= 0 && arrAux[secondIndex] > minor) {
                    arrAux[secondIndex + 1] = arrAux[secondIndex];
                    secondIndex--;
                }

                arrAux[secondIndex + 1] = minor;
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro durante o insertionSort: " + e.getMessage());
        }
    }
}
