package doubt_class;

public class Maximum_Circular_sum {
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circular_sum(arr));
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
    public static int Maximum_sum(int[] arr){
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

