import java.util.Scanner;

public class Baitap6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhạp chuoi ban dau: ");
        String s = sc.nextLine();
        String[] words = s.split("");

        System.out.println("\nNhap tu muon dem: ");
        String x = sc.next();

        int dem = 0;
        for (int i = 0; i < words.length; i++) {
            if (x.equals(words[i])) ;
            dem++;
        }
        System.out.println("So lan xuat hien cua "+x+" trong chuoi la: "+dem +" lan ");
    }
}
