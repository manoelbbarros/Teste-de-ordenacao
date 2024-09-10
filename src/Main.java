import java.io.*;
import java.util.Arrays;

import metodosOrdenacao.*;

public class Main {

    public static void main(String[] args) {
        //Para 1 milhao
        order("src\\dataBase\\test-array-1M-constante.txt",1_000_000, "Tempo de cada metodo para constante de 1 milhao:");
        order("src\\dataBase\\test-array-1M-crescente.txt",1_000_000, "Tempo de cada metodo para crescente de 1 milhao:");
        order("src\\dataBase\\test-array-1M-decrescente.txt",1_000_000, "Tempo de cada metodo para decrescente de 1 milhao:");
        order("src\\dataBase\\test-array-1M-desordenado.txt",1_000_000, "Tempo de cada metodo para desordenado de 1 milhao:");
        order("src\\dataBase\\test-array-1M-desordenado-nos-10_-iniciais.txt",1_000_000, "Tempo de cada metodo para desordenado nos 10_ iniciais de 1 milhao:");
        order("src\\dataBase\\test-array-1M-desordenado-nos-10_-finais.txt",1_000_000, "Tempo de cada metodo para desordenado nos 10_ finais de 1 milhao:");

        //Para 2 milhoes
        order("src\\dataBase\\test-array-2M-constante.txt",2_000_000, "Tempo de cada metodo para constante de 2 milhoes:");
        order("src\\dataBase\\test-array-2M-crescente.txt",2_000_000, "Tempo de cada metodo para crescente de 2 milhoes:");
        order("src\\dataBase\\test-array-2M-decrescente.txt",2_000_000, "Tempo de cada metodo para decrescente de 2 milhoes:");
        order("src\\dataBase\\test-array-2M-desordenado.txt",2_000_000, "Tempo de cada metodo para desordenado de 2 milhoes:");
        order("src\\dataBase\\test-array-2M-desordenado-nos-10_-iniciais.txt",2_000_000, "Tempo de cada metodo para desordenado nos 10_ iniciais de 2 milhoes:");
        order("src\\dataBase\\test-array-2M-desordenado-nos-10_-finais.txt",2_000_000, "Tempo de cada metodo para desordenado nos 10_ finais de 2 milhoes:");

        //Para 3 milhoes
        order("src\\dataBase\\test-array-3M-constante.txt",3_000_000, "Tempo de cada metodo para constante de 3 milhoes:");
        order("src\\dataBase\\test-array-3M-crescente.txt",3_000_000, "Tempo de cada metodo para crescente de 3 milhoes:");
        order("src\\dataBase\\test-array-3M-decrescente.txt",3_000_000, "Tempo de cada metodo para decrescente de 3 milhoes:");
        order("src\\dataBase\\test-array-3M-desordenado.txt",3_000_000, "Tempo de cada metodo para desordenado de 3 milhoes:");
        order("src\\dataBase\\test-array-3M-desordenado-nos-10_-iniciais.txt",3_000_000, "Tempo de cada metodo para desordenado nos 10_ iniciais de 3 milhoes:");
        order("src\\dataBase\\test-array-3M-desordenado-nos-10_-finais.txt",3_000_000, "Tempo de cada metodo para desordenado nos 10_ finais de 3 milhoes:");

    }
    public static void order(String fileName, int tam, String name) {
        Runtime runtime = Runtime.getRuntime();

        double[] arr = new double[tam];
        long start = 0, end = 0, beforeUsedMem, afterUsedMem;

        arr = fileToArray(fileName, arr);
        System.out.println(name);

        System.gc(); //Limpar o lixo na memoria
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        bubbleSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("BubbleSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");

        System.gc();
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        countingSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("CountingSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");

        System.gc();
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        insertionSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("InsertionSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");

        System.gc();
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        mergeSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("MergeSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");

        System.gc();
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        quickSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("QuickSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");

        System.gc();
        beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();
        start = System.currentTimeMillis();
        selectionSort.sort(Arrays.copyOf(arr, tam));
        end = System.currentTimeMillis();
        afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("SelectionSort\nTempo:" + (end - start) / 1000 + " segundos ou " + (end - start) + " milissegundos\nMemoria: " + (afterUsedMem - beforeUsedMem) + " bytes\n");
    }
    public static double[] fileToArray(String fileName, double[] arr) {
        int index = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    arr[index] = Double.parseDouble(line.trim());
                    index++;
                } catch (NumberFormatException e) {
                    // Ignorar linhas que não podem ser convertidas para double
                    System.out.println("Linha ignorada (não é um número): " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
        return arr;
    }
}