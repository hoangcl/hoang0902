import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i < n ; i++) {
            map.put(i, i *i);
        }
        System.out.println(map);
    }
}
