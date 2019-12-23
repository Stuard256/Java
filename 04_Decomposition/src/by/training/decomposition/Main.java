package by.training.decomposition;

import by.training.decomposition.array.entity.Array;
import by.training.decomposition.lcm.LeastCommonMultiple;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         LeastCommonMultiple number = new LeastCommonMultiple();
         System.out.println(number.lcm(13,1,3,4,5));

        /**
        Array arr = new Array();
        int[] array = new int[10];
        arr.fullFill(array);
        System.out.println(Arrays.toString(array));
        arr.invert(array);
        **/
    }
}
