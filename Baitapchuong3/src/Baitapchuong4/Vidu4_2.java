package Baitapchuong4;

import java.util.Scanner;

public class Vidu4_2 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
    }
}
