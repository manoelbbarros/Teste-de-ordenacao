package metodosOrdenacao;
import java.util.Arrays;
import java.util.Stack;
public class quickSort {
    public static void sort(double[] arrAux){
        try {
            if(arrAux == null) throw new NullPointerException("O array esta nulo");

            quick(arrAux, 0, arrAux.length-1);
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro durante o quickSort: " + e.getMessage());
        }
    }
    public static void quick(double[] arr, int low, int high) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {low, high});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            low = range[0];
            high = range[1];

            if (low < high) {

                int pivotIndex = partition(arr, low, high);


                if (low < pivotIndex - 1) {
                    stack.push(new int[] {low, pivotIndex - 1});
                }
                if (pivotIndex + 1 < high) {
                    stack.push(new int[] {pivotIndex + 1, high});
                }
            }
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
