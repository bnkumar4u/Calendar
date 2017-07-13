package Calendar;

import java.util.Calendar;
import java.util.Scanner;


public class GetDayOfDate {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter any date in format MM DD YYYY");

        int month1=scan.nextInt();

        month1--;
        int date = scan.nextInt();

        int year =scan.nextInt();


        Calendar cal =Calendar.getInstance();

        cal.set(year,month1,date);

        Scanner in = new Scanner(String.valueOf(cal.getTime()));

        String day = new String(in.next());

        System.out.println("The day of that week is ");

        switch (day)
        {
            case "Mon":
                System.out.println("MONDAY");
                break;

            case "Tue":
                System.out.println("TUESDAY");
                break;

            case "Wed":
                System.out.println("WEDNESDAY");
                break;

            case "Thu":
                System.out.println("THURSDAY");
                break;

            case "Fri":
                System.out.println("FRIDAY");
                break;

            case "Sat":
                System.out.println("SATURDAY");
                break;

            case "Sun":
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println(day);

        }

    }
}
