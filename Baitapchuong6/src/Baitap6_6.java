import java.util.Scanner;

public class Baitap6_6 {
    public static void main(String[] args) {
        String chuoi;
        char n;
        int dem = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        chuoi = sc.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            n = chuoi.charAt(i);

            if (Character.isDigit(n)) {
                dem++;
            }
        }
        System.out.println("Số lần khoản trang xuất hiện trong chuỗi: " +dem);
    }
}
