public class Answer_5b {
    public static void main(String[] args) {
        int side = 5;

        System.out.println("Displaying The Hollow Square Star Pattern");

        for (int i = 0; i < side; i++ )
        {
            for (int j = 0 ; j < side; j++ )
            {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
