package doubt_class;

public class Painter_Partition {
    public static void main(String[] args) {
        int k = 2;
        int[] board = {10, 20, 30, 40};
        System.out.println(Partition(board, k));
    }


    public static int Partition(int[] board, int k) {
        int low = 0;
        int hi = 0;
        for (int i = 0; i < board.length; i++) {
            hi = hi + board[i];
        }
        int ans = 0;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (isitpossible(board, k, mid) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }


            return ans;
        }

    public static boolean isitpossible( int[] board, int k, int mid){
            int painter = 1;
            int time = 0;
            for (int i = 0; i < board.length;) {
                if (time + board[i] <= mid) {
                    time = time + board[i];
                    i++;
                } else {
                    painter++;
                    time = 0;
                }
                if (painter > k) {
                    return false;
                }
            }
            return true;
        }
    }
