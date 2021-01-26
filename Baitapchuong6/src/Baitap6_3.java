public class Baitap6_3 {
    public static double S(int n) {
        double s = 0;
        int p = 1;
        ;
        for (int i = 1; i <= n; i++) {
            p *= 1;
            s += (double) 1 / p;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Bieu thuc = " + S(5));
    }
}