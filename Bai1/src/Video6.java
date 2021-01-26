public class Video6 {
    int X = 88;

    public static void main(String[] args) {
        int x = 0;
        {
            int X = 99;
            System.out.println(x);// ok
            // a block of code
            {
                // khoi
            }
        }
        System.out.println(x);// ok
    }
    // other block}
}
