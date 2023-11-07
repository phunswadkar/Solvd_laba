package InsertionSortAlgorithm;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        //condition to check if user has passed command line arguments
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Enter the count of elements to sort:");
            count = scanner.nextInt();
        } else {
            count = Integer.parseInt(args[0]);
        }

        System.out.println("Enter the elements to sort:");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the original unsorted array
        System.out.println("Original Array:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + arr[i]);
        }

        // Measure the execution time before sorting
        long initiate = System.nanoTime();

        // Sort the array using the insertion sort algorithm
        insertionSort(arr);

        // Measure the execution time after sorting
        long finish = System.nanoTime();
        long time = finish - initiate;

        // Display the sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + arr[i]);
        }

        // Display the execution time in nanoseconds
        System.out.println("\nExecution Time in nanoseconds: " + time);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int ele = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than element
            while (j >= 0 && arr[j] > ele) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ele;
        }
    }
}

