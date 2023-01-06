package doubt_class;
import java.util.*;

public class book_Allocation_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int pages=sc.nextInt(); //number of pages
            int NOS = sc.nextInt();
            int[] NOBook = new int[pages];
            for (int i = 0; i < pages; i++) {
                NOBook[i] = sc.nextInt();
            }
                System.out.print(maximumNOP(NOBook, NOS));
        }

    }
    public static int maximumNOP(int[] NOBook, int NOS) {
        int low = 0;
        int hi = 0;
        for (int i = 0; i <NOBook.length; i++) {
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

