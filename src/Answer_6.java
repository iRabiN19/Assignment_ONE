import java.util.Scanner;

public class Answer_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int first,second, third;

        System.out.print("Enter the first number: ");
        first=sc.nextInt();
        System.out.print("Enter the second number: ");
        second=sc.nextInt();
        System.out.print("Enter the third number: ");
        third=sc.nextInt();

        if(first<second && second<third){
            System.out.println("The numbers are in an ascending order.");
        }
        else if(third<second && second<first){
            System.out.println("The numbers are in a descending order.");
        } else System.out.println("The numbers are neither in an ascending nor descending order.");
    }
}
