import java.util.Scanner;

public class Answer_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float kg,bmi,height;

        System.out.print("Enter your weight in kg: ");
        kg= sc.nextFloat();
        System.out.print("Enter your height in metres: ");
        height=sc.nextFloat();

        bmi=kg/(height*height);
        System.out.println("Your Body Mass Index(BMI) is: "+bmi+" kg/m2.");
    }
}
