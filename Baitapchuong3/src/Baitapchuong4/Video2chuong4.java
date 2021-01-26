package Baitapchuong4;

public class Video2chuong4 {
    public static void main(String[] args) {
        // cach 1
        //int[] arr = {1,2,3,4,5,6,7,8,9,2,-99};
        //cach 2
        int[] arr = new int[]{1,3,4,99,5,7,9,0};
        int len = arr.length;
        //cach 3
        int[] b = new int[20];

        for (int i = 0; i< len; i++){
            b[i] = 199;
        }

        for (int i: b){
            System.out.print(i+" ");
        }
    }
}
