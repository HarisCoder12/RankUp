package Assighnment;

import java.util.Scanner;

public class sorting_in_linear_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        linear_time(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void linear_time(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int mid = 0;
        while (mid <= j) {
            if (arr[mid] == 0) {
                int temp = arr[i];
                arr[i] = arr[mid];
                arr[mid] = temp;
                i++;
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[j];
                arr[j] = arr[mid];
                arr[mid] = temp;
                j--;
            } else {
                mid++;
            }
        }
    }
}







