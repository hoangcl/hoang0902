import java.util.Scanner;

public class Video21 {

    public static int findMaxElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] nhapMang(int n, Scanner scanner) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextTnt();
        }

        return arr;
    }

    public static int[][] nhapMang2Chieu(int n, Scanner scanner) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Scanner.nextTnt();
            }
        }

        return arr;
    }

    public static String[] tachTuTrongXau(String s){
        String[] result = s.split( " " );
        return result;
    }

    public static void showArrResult(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void showArrResult(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void show2DArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        public static void main(String[] args);
        int[] arr1, arr2, arr3;
        int n1 = 5, n2 = 7, n3 = 9;
        Scanner scanner = new Scanner(System.in);

//        arr1 = nhapMang(n1, scanner);
//        arr2 = nhapMang(n2, scanner);
//        arr3 = nhapMang(n3, scanner);

        //int max = findMaxElement(arr1);
        String str = "TOday a beautiful day";
        String[] strs = tachTuTrongXau(str);

    }

}