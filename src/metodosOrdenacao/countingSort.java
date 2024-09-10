package metodosOrdenacao;

import java.util.HashMap;

public class countingSort {
    public static void sort(double[] arrAux) {
        try {
            if (arrAux == null || arrAux.length == 0) {
                throw new IllegalArgumentException("O array está vazio ou nulo.");
            }

            double minimo = arrAux[0];
            double maximo = arrAux[0];
            for (double valor : arrAux) {
                if (valor < minimo) {
                    minimo = valor;
                } else if (valor > maximo) {
                    maximo = valor;
                }
            }

            // Subtrair o mínimo de todos os elementos para garantir que todos sejam
            // positivos
            for (int i = 0; i < arrAux.length; i++) {
                arrAux[i] -= minimo;
            }

            // Usar HashMap para contar a ocorrência de cada valor
            HashMap<Double, Integer> contagem = new HashMap<>();
            for (double valor : arrAux) {
                contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
            }

            // Reconstruir o array original com os valores ordenados
            int index = 0;
            for (double i = 0; i <= maximo - minimo; i++) {
                int count = contagem.getOrDefault(i, 0);
                for (int j = 0; j < count; j++) {
                    arrAux[index++] = i + minimo; // Adicionar o mínimo de volta
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de índice fora dos limites: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no Counting Sort: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
