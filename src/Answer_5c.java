public class Answer_5c {
    public static void main(String[] args)
    {
        int rows=5;

        System.out.println("\nThe star pattern is... ");
        for (int i = 1; i <= rows; i++)
        {
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
