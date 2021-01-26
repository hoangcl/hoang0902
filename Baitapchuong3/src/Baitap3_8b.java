import java.util.Scanner;
public class Baitap3_8b {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n =scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++){//Xet uoc la so duong
            if (n % i == 0){
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("\nn co " + count + "uoc so");
    }
}
