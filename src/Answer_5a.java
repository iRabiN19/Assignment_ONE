public class Answer_5a {
    public static void main(String[] args)
    {
        int side =5, i, j;


        System.out.println("Displaying the square star pattern: ");
        for(i = 1; i <= side; i++)
        {
            for(j = 1; j <= side; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
