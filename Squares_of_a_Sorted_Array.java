package Assighnment;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        square(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] square(int[] arr) {
        //int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // ans=Math.pow(arr[i],2);
            arr[i] = arr[i] * arr[i];

        }
        Arrays.sort(arr);
        return arr;
    }
}


