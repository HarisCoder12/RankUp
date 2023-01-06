package lecture_12;
import java.util.*;

public class binary_search_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(search(arr, item));

    }

    public static int search(int[] arr, int item) {
        int low = 0;
        int hi = arr.length - 1;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
