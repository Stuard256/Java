package by.training.sorting.insert;

import by.training.sorting.service.SortingService;

import java.util.Arrays;

public class InsertSort {
    SortingService service = new SortingService();

    public void insertionSort(int[] sourceArray){
        int[] destinationArray = new int[sourceArray.length];
        int destinationSize = 0;
        for (int i : sourceArray) {

            // Ищем место для вставки
            // Мы просто просматриваем все элементы, но при желании можно
            // использовать бинарный поиск.
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < i) {
                    insertIndex++;
                }
            }
            // Вставка
            if (destinationSize - insertIndex >= 0)
                System.arraycopy(destinationArray, insertIndex, destinationArray, insertIndex + 1, destinationSize - insertIndex);
            destinationArray[insertIndex] = i;
            destinationSize++;
        }
        sourceArray = destinationArray;
        //service.print(sourceArray);
    }


    public void insertionBinarySort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int location = i - 1;
            int insertPlace;

            if(array[location] > array[i]) {
                int tmp = array[i];
                insertPlace = Arrays.binarySearch(array, 0, location, array[i]);
                if(insertPlace < 0){
                    System.arraycopy(array, ~insertPlace, array,~insertPlace + 1,  i - ~insertPlace);
                    array[~insertPlace] = tmp;
                }else{
                    System.arraycopy(array, insertPlace, array, insertPlace + 1,  i - insertPlace);
                    array[insertPlace] = tmp;
                }
            }
        }
        //service.print(array);
    }
}
