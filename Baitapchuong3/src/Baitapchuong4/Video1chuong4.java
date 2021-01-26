package Baitapchuong4;

public class Video1chuong4 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 100;
        arr[1] = 200;
        arr[9] = -999;

        int x = arr[1];
        int n = args.length;

        //System.out.println(x);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //int [] b = arr;
        // tao mang nguyen arr co kha nang luu tru 100 ptu
    }
}