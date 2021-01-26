public class Baitap6_1 {
    public static int a = 2, b = 8;

    public static int UCLN(int a, int b){
        if (b == 0) return a;
        return UCLN(b, a%b);
    }

    public static void main(String[] args){
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b +
                " la: " + UCLN(a,b));
    }
}