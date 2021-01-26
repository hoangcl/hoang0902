import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Baitap3_5 {
      //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
      private static Scanner input;

      //Chuong trinh chinh
      public static void  main(String[] args){
            //Khoi tao doi tuong input
            input = new Scanner(System.in);
            //Khai bao bien 2 ben ten, matkhau
            String ten=null, matkhau=null;
            int dem=1;
            //Thuc hien nhap ten, matkhau toi da 3 lan
            while (dem<=3){
                   System.out.print("Nhập tên người dùng: ");
                   ten = input.next();
                   System.out.print("Nhập mật khẩu: ");
                   matkhau = input.next();
                   //Neu ten va matkhau nhap vao dung thi thoat vong lap
                   if((ten.equals("khuong")) && (matkhau.equals("123")))
                         break;

                }
            //Khai bao bien tong
            int tong=0;
            //Thuc hien vong lap for kiem tra tung so tu 100 den 200
            for (int i=100; i<=200; i++) {
                  //Neu i thoa dieu kien thi hien thi va cong i vao bien trong
                  if((i%3==0&&i%5==0)){
                      System.out.print(i + " ");
                      tong=tong+i;
                  }
            }
            System.out.println("\nTổng các số thoả điều kiện là: "+ tong);
         }
      }
