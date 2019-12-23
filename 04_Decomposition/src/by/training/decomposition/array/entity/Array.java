package by.training.decomposition.array.entity;

import java.util.Arrays;
import java.util.Random;

public class Array {

    Random random = new Random();

    public void fullFill(int[] array){
        for (int i= 0; i< array.length;i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void invert(int[] array){
        int n = array.length;
        //Переменная, которая будет использоваться при обмене элементов
        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
