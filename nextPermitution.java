package doubt_class;
import java.util.*;

public class nextPermitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            //int arr[] = {2, 3, 2, 6, 4, 3, 1};
            //permutation(arr);
            for (int i = 0; i < arr.length; i++) {
                //System.out.print(arr[i]+" ");
                arr[i] = sc.nextInt();

            }

            permutation(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");

            }
            t--;
        }
    }


    public static void permutation(int[] arr) {
        int p = 0;
        int q = 0;
        int n = arr.length;
        for (int i = n - 2; i>= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        if(p==0 && q==0) {
            reverse(arr, 0, n - 1);
            return ;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverse(arr,p+1,n-1);
    }

    public static void reverse(int[]arr, int i,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    }
