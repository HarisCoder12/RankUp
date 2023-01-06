package lecture_12;
import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int MinI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[MinI] > arr[j]) {
                    MinI = j;
                }
            }

   //ublic static int swap(int[] arr, int i, int MinI) {
        int temp = arr[i];
        arr[i] = arr[MinI];
        arr[MinI] = temp;

        }
    }
}

