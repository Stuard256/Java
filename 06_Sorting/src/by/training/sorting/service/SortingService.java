package by.training.sorting.service;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class SortingService {
    Random random = new Random();

    public int findMinIndex(@NotNull int[] array){
        int minimumIndex = 0;
        for(int i=0; i< array.length; i ++)
            if (array[i] < array[minimumIndex]) minimumIndex = i;
        return minimumIndex;
    }

    public int findMaxIndex(@NotNull int[] array){
        int maximumIndex = 0;
        for(int i=0; i< array.length; i ++)
            if (array[i] > array[maximumIndex]) maximumIndex = i;
        return maximumIndex;
    }

    public void swap(@NotNull int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public int[] generate(int n){
        int[] array = new int[n];
        for(int i=0; i< n; i++){
            array[i]= random.nextInt(100)+1;
        }
        return array;
    }

    public void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
