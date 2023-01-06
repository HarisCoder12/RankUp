package lecture_12;


public class maximum_subarray_using_oneloop {
    public static void main(String[] args) {
        int[] arr={8,-8,9,-9,10,-11,12};
        System.out.println(subarray(arr));

    }
    public static int subarray(int[] nums){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {

                sum = sum + nums[i];
                ans = Math.max(ans, sum);
                if(sum<0){
                    sum=0;
            }
        }
        return ans;
    }
}

