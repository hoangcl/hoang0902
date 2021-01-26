public class Baitap3_6 {
    public static void main(String[] args) {
          //Khai bao cac bien de dem
          int dem0=0, dem1=0, dem2=0, dem3=0;
          //Duyet ta ca cac bien de dem
          for (int i=0; i<=100; i++){
                //Kiem tra gia tri i chia lay du cho 5
              switch (i%5){
                  case 0:
                      dem0++;
                      break;
                  case 1:
                      dem1++;
                      break;
                  case 2:
                      dem2++;
                      break;
                  case 3:
                      dem3++;
                      break;
              }
          }
          //Hien thi ket qua
          System.out.println("Số các số chia hết cho 5 là: " + dem0);
          System.out.println("Số các số chia cho 5 dư 1 là: " + dem1);
          System.out.println("Số các số chia hết cho 5 dư 2 là: " + dem2);
          System.out.println("Số các số chia hết cho 5 dư 3 là: " + dem3);
    }
}
