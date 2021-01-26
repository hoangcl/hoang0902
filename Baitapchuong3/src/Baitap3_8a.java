import java.util.Scanner;

public class Baitap3_8a {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so a : ");
        n=sc.nextInt();
        if (n>0)
        {
            if (kiemtrasonguyento(n)==1)
                System.out.println(n+" la so nguyen to");
            else
                System.out.println(n+" Khong phai la so nguyen to");
        }
    }
    public static int kiemtrasonguyento(int n)
    {
        int dem=0;
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)
                dem++;
        }
        if (dem==2)
            return 1;
        else return 0;
    }
}
