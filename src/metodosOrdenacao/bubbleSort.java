package metodosOrdenacao;

import java.util.Arrays;

public class bubbleSort {
    public static void sort(double[] arrAux){
        try {
            if(arrAux == null) throw new NullPointerException("O array esta nulo");

            boolean trades;
            int lastUnsorted = arrAux.length - 1;
            do {
                trades = false;
                int newLastUnsorted = 0;
                for (int index = 0; index < lastUnsorted; index++) {
                    if (arrAux[index] > arrAux[index + 1]) {
                        double aux = arrAux[index];
                        arrAux[index] = arrAux[index + 1];
                        arrAux[index + 1] = aux;
                        trades = true;
                        newLastUnsorted = index;

                    }
                }
                lastUnsorted = newLastUnsorted;
            } while (trades);
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro durante o bubbleSort: " + e.getMessage());
        }
    }
}
