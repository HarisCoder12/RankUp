package Assighnment;

import java.util.Scanner;

public class circular_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            t--;

            System.out.print(circular_sum(arr));

        }

    }
    public static int circular_sum(int[] arr) {
        int linear_sum = Maximum_sum(arr);
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = arr[i] * -1;
        }
        int mid_sum = Maximum_sum(arr);
        int cirs = sum + mid_sum;
        if (cirs == 0) {
            return linear_sum;
        }
        return Math.max(cirs, linear_sum);
    }
    public static int Maximum_sum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}

