import jdk.swing.interop.SwingInterOpUtils;

public class Video15 {
    public static void main(String[] args) {
        String dk = "SANG";
        switch (dk) {
            case "SANG":
                // do somthing in this case
                System.out.println("Buoi sang tot lanh!");
                //break;
            case "TRUA":
                // do somthing in this case
                System.out.println("Buoi trua an lanh!");
                //break;
            case "CHIEU":
                // do somthing in this case
                System.out.println("Buoi chieu am ap!");
                break;
            case "TOI":
                // do somthing in this case
                System.out.println("Buoi toi binh an!");
                break;
            default:
                System.out.println("ngay moi tot lanh!");
                break;
        }
    }
}
