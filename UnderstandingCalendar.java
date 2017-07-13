package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UnderstandingCalendar {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();

       // Date now = new SimpleDateFormat();
//        System.out.println("1"+rightNow);
//        System.out.println("2"+rightNow.clone());
//        System.out.println("3"+rightNow.getCalendarType());
//        System.out.println("4"+rightNow.getFirstDayOfWeek());
//        System.out.println("5"+rightNow.getTime());
//        System.out.println("6"+rightNow.getTimeZone());
//        System.out.println("7");

        rightNow.set(2017, 06, 12);
        System.out.println(rightNow.getTime());
        String s= String.valueOf(rightNow.getTime());



        String day =new String();
        for(int i=1;i<=10;i++)
        {
            rightNow.set(2017,06,i);
            s=String.valueOf(rightNow.getTime());
            Scanner in = new Scanner(s) ;
            day=in.next();
            System.out.println(day);
        }

        System.out.println(s);

    }
}
