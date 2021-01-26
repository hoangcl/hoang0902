public class Baitap8 {
    public static void main(String[] args) {
        int a = 50, b = 200, gcd = 1;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        System.out.printf("Ước chung lớn nhất của %d và %d là: %d", a, b, gcd);
    }
}