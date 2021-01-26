import java.util.Scanner;

public class Baitap3_1 {
    //Khai bao do tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khai bao doi tuong input
        input = new Scanner(System.in);
        //Nhap gia tri cho bien a, b kieu so thuc tu ban phim
        System.out.println("Nhap a: ");
        float a = input.nextFloat();
        System.out.println("Nhap b: ");
        float b = input.nextFloat();
        //Hien thi ket qua tinh toan ra man hinh
        System.out.println("Ket qua bai toan a + b la: " + (a + b));
        System.out.println("Ket qua bai toan a - b la: " + (a - b));
        System.out.println("Ket qua bai toan a * b la: " + (a * b));
        System.out.println("Ket qua bai toan a / b la: " + (a / b));
    }
}