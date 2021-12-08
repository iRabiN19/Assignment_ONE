import java.util.Scanner;

public class Answer_1 {
    public static void main(String[] args) {
        int low = 1, num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num= sc.nextInt();
        System.out.println("The prime numbers are: ");
        while (low < num) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}

