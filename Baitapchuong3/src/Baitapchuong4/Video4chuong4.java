package Baitapchuong4;

public class Video4chuong4 {
    public static void main(String[] args) {
            int[][] arr = new int[4][3];

            /* chi so bat ki:0 -> length */
            arr[0][0] = 100;
            arr[0][1] = 200;
            arr[arr.length-1][arr[0].length-1] = -999;

            boolean[][] booleans = new boolean[9][9];

            String[][] strings = new String[2][3];

            int [][] arr2 = /* new int[][] */{
                    {1,2,3,4,},
                    {5,6,7,8},
                    {0,1,9,8}
            };
        // gan cac phan tu cua mang
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i*j;
            }
            
        }       
        //xuat cac phan tu cua mang:
        for (int i = 0; i < arr.length; i++){//arr.length: so hang
                for (int j = 0; j < arr[0].length; j++){// arr[0].length: so cot
                    System.out.println(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
