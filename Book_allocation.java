package doubt_class;

public class Book_allocation {
    public static void main(String[] args) {
        int NOS = 2;
        int[] NOBook= {12, 34,67,90};
        System.out.println(maximumNOP(NOBook, NOS));
    }


    public static int maximumNOP(int[] NOBook, int NOS) {
        int low = 0;
        int hi = 0;
        for (int i = 0; i < NOBook.length; i++) {
            hi = hi + NOBook[i];
        }
        int ans = 0;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (isitpossible(NOBook, NOS, mid) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return ans;
    }

    public static boolean isitpossible( int[] NOBook, int NOS, int mid){
        int Student = 1;
        int time = 0;
        for (int i = 0; i < NOBook.length;) {
            if (time + NOBook[i] <= mid) {
                time = time + NOBook[i];
                i++;
            } else {
                Student++;
                time = 0;
            }
            if (Student > NOS) {
                return false;
            }
        }
        return true;
    }
}


