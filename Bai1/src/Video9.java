public class Video9 {
    /*
     - toan tu so hoc: + - * / %
     - toan tu gan: = *= /= -= += %=
     */
    public static void main(String[] args) {
        int a = 125;
        int b = 255;
        float res = a / (b * 1.0f);
        int res2 = a / b;
//        System.out.println("kq phep chia nguyen: " + res2);
//        System.out.println("kq chia so thuc: " + res);
//        int kq = a%b;
//        System.out.println("kq phep chia lay du: " + kq);
        a = a + 100;
        // tuong duong:
        a += 100;
        a*= 100; // a * a = 100
        int c = a + b;
    }
}