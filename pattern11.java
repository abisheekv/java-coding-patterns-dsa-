public class pattern11{
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {          // rows
            for (int j = 0; j <= i; j++) {     // columns
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
