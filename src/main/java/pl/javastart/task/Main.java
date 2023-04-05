package pl.javastart.task;

import java.util.Arrays;

public class Main {

    // uzupełnij metodę BubbleSort.sort()
    // poniżej przykładowe wydruki
    // to zadanie ma dostępne testy jednostkowe w src/test/java/[...]/BubbleSortTest
    public static void main(String[] args) {
        sortAndPrintInfo(1, 2, 3);
        sortAndPrintInfo(5, 2, 3, 1, 4);
        sortAndPrintInfo(4, 2, 5, 1, 7);
        sortAndPrintInfo(5, 4, 3, 2, 1);
        sortAndPrintInfo(1, 2, 3, 4, 5);
        sortAndPrintInfo(2, 1, 3, 4, 5);
        sortAndPrintInfo(99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    private static void sortAndPrintInfo(int... arrayToSort) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("=================");
        System.out.printf("Przed sortowaniem: %s\n", Arrays.toString(arrayToSort));
        int compareCount = bubbleSort.sort(arrayToSort);
        System.out.printf("Po sortowaniu: %s\n", Arrays.toString(arrayToSort));
        System.out.printf("Liczba porównań: %d\n", compareCount);
        System.out.println("=================");
    }
}
