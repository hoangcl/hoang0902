import java.util.Scanner;

public class Baitap3_8c {
    public static void main(String[] args) {
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 1;
        while (true){
            if (isNgTo(x)){
                System.out.println();
                count++;
            }
            if (count == n){
                break;
            }
            if (x == 2)
                x++;
            else{
                x+= 2;
            }
        }
    }

    public static boolean isNgTo(int n){
        for (int i = 2; i<= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

