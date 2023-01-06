package Assighnment;

import java.util.Scanner;

public class Spiral_wave_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();
            }
           spiralwave(arr);
            for( row=0;row<arr.length;row++){
                for(int col=0;col<arr[0].length;col++){
                    System.out.println(arr[row][col]);
                }
            }

        }
}
    public static void spiralwave(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int maxr = arr.length-1;
        int TE = arr.length * arr[0].length;
        int count = 0;
        while (count < TE) {
            for (int i = minc; i <= maxc && count < TE; i++) {
                System.out.println(arr[minr][i] + " ");
                count++;
            }
            minr++;

            for (int i = minr; i <= maxr && count < TE; i++) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count < TE; i--) {
                System.out.println(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < TE; i--) {
                System.out.println(arr[i][minc] + " ");
                count++;
            }
            minc++;

        }
    }
}

