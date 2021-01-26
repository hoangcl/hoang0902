public class Baitap6_2 {
    public static int S(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Bieu thưc = " + S(7));
    }
}