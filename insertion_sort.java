package Lecture13;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 5, 4,0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int item=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
    }
}
