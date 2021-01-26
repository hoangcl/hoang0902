import java.text.DecimalFormat;
import java.util.Scanner;

public class Baitap7 {
    class Number {
        int num;
        public Number(int num) {        // ham khoi tao
            this.num = num;
        }

        public int getNum() {           // ham tra ve gia tri num
            return num;
        }

        public void setNum(int num) {   // ham set gia tri num
            this.num = num;
        }
    }
    public static void main(String[] args) {
        int x, y;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số x: ");
        x = scanner.nextInt();
        System.out.println("Nhập vào số y: ");
        y = scanner.nextInt();
        if (x > 3) {
            if (y > 3) {
                System.out.println("Befor swap: a = \" + a.getNum() + \" b = \" + b.getNum()");

            }
        }
    }
}
