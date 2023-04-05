package pl.javastart.task;

import javax.swing.plaf.IconUIResource;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int n = inputArray.length;
        int k = n - 1;
        int counter = 0;
        boolean changed = true;
        do {
            if (changed) {
                for (int i = 0; i < k; i++) {
                    changed = false;
                    if (inputArray[i] > inputArray[i + 1]) {
                        int temp = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = temp;
                        changed = true;
                    }
                    counter++;
                }
            }
            n--;
            k--;
        } while (n > 1);
        return counter;
    }
}
