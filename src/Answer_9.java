import java.util.Scanner;

public class Answer_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float timeSeconds, timeHours, mps,kph, mph;

        System.out.print("Enter the distance in meters: ");
        float distance = sc.nextFloat();

        System.out.print("Enter the hour(s): ");
        float hr = sc.nextFloat();

        System.out.print("Enter the minute(s): ");
        float min = sc.nextFloat();

        System.out.print("Enter the second(s): ");
        float sec = sc.nextFloat();

        timeSeconds = (hr*3600) + (min*60) + sec;
        timeHours=hr+(min/60)+sec/3600;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeHours );
        mph = (distance/ 1609)/timeHours;

        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);


    }
}
