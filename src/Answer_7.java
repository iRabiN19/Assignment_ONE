import java.util.Scanner;

public class Answer_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first floating point number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second floating point number: ");
        float num2 = sc.nextFloat();
        sc.close();

        if ((num1 - num2) <= 0.01 || (num1-num2) >=-0.01 ) {
            System.out.println("These numbers are the same up to two decimal places.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
