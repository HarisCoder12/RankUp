package LeetCode;

import java.util.*;

public class single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        single(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    public static int single(int[]arr){
        int ans=0;
        for(int i:arr){
            ans^=i;
        }
        return ans;
    }

}
