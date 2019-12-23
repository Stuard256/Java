package by.training.sorting.select;

import by.training.sorting.service.SortingService;
import org.jetbrains.annotations.NotNull;

import javax.swing.text.StyleContext;

public class SelectSort {
    SortingService service = new SortingService();

    public void simpleSelectionSort(int n) {
        int[] array = service.generate(n);
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            service.swap(array, left, minInd);
        }
        service.print(array);
    }

    public void doubleSelectionSort(int n){
        int[] array = service.generate(n);
        for (int i = 0 ; i < array.length/2 + 1; i++) {

            int minInd = i;
            int maxInd = array.length - i - 1;

            for (int j = i + 1; j < array.length - i - 1; j++) {
                if (array[minInd] > array[j]) {
                    minInd = j;
                }
                if (array[maxInd] < array[j]) {
                    maxInd = j;
                }
                service.swap(array,i, minInd);
                service.swap(array,array.length - i - 1, maxInd);
            }
        }

        service.print(array);
    }
}
