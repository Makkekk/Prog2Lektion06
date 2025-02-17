package Opgave02;

import java.util.Arrays;

public class Opgave02Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));


        //Ekstra opgave
        int n = 20;
        int[] storage = new int[n + 1];
        Arrays.fill(storage, - 1);

        System.out.println(fibonacciStorage(n, storage));

    }

    public static int fibonacci(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fibonacci(index - 1) + fibonacci(index - 2);
    }

    //Ekstraopgave
    public static int fibonacciStorage(int index, int[] storage) {
        if (index == 0) return 0;
        if (index == 1) return 1;

        if (storage[index] != -1) {
            return storage[index];
        }
        storage[index] = fibonacciStorage(index - 1, storage) + fibonacciStorage(index - 2, storage);
        return storage[index];
    }
}
