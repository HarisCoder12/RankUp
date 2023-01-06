package doubt_class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Murthal_pratha {
    public static void main(String[] args) {
        int pratha=10;
        int nocook=4;
        int[] arr={1,2,3,4};
        Arrays.sort(arr);
        System.out.println(minimum_time(arr,pratha));
    }
    public static int minimum_time(int[]arr,int pratha){
    int low=0;
    int hi=arr[arr.length-1]*(pratha*(pratha+1))/2;
    int ans=0;
    while(low<=hi){
        int mid=(low+hi)/2;
        if(isitpossible(arr,mid,pratha)) {
            ans = mid;
            hi = mid - 1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
    }
    public static boolean isitpossible(int[]arr,int mid,int pratha) {
        int p = 1;
        int time = 0;
        int tp = 0;
        int i = 0;
        while (i < arr.length) {
            if (time + p * arr[i] <= mid) {
                time = time + p * arr[i];
                p++;
                tp++;
            } else {
                p = 1;
                i++;
                time = 0;
            }
            if (tp >= pratha) {
                return true;
            }
        }
        return false;
    }
}
