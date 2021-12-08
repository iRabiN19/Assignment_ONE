import java.util.Scanner;

public class Answer_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num, temp, remainder, result = 0;
        System.out.print("Enter a number: ");
        num= sc.nextInt();

        temp = num;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += remainder*remainder*remainder;
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
