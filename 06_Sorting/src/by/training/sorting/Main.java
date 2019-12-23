package by.training.sorting;

import by.training.sorting.insert.InsertSort;
import by.training.sorting.select.SelectSort;
import by.training.sorting.service.SortingService;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        //SelectSort selectSort = new SelectSort();
        //selectSort.simpleSelectionSort(10);
        InsertSort insert = new InsertSort();
        SortingService sort = new SortingService();
        int[] arr = sort.generate(30);
        int[] secArr = arr.clone();
        sort.print(arr);
        System.out.println("----------------------------------");
        insert.insertionSort(arr);
        insert.insertionBinarySort(secArr);
    }
}
