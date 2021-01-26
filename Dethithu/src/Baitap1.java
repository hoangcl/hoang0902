import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri: ");
        n = sc.nextInt();
        //Baitap1_1

        //Nhập mảng A
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }
        //Hiển thị giá trị trong mảng
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println("\n");

        //Baitap1_2
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 4 != 0) {
                dem++;
            }
        }
        System.out.println("So gia tri chia het cho 3 ma khong chia het cho 4 la: " + dem);

        //Baitap1_3
        //tim max
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);

        //tim min
        int min = A[0];
        for (int i = 0; i < n; i++) {
            if (min > A[i]) {
                min = A[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la: " + min);

        //Baitap1_4
        System.out.println("Nhap them gia tri: ");
        int X = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                System.out.println("Co ton tai trong mang");
                break;
            } else {
                System.out.println("Khong ton tai trong mang");
                break;
            }
        }
    }
}