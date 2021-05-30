import java.util.Scanner; public class ConvertMinutes {

public static void main(String[] Strings) {


    double minutesInYear = 60 * 24 * 365;   //24hrs= (24*60) mins as 1 hr=60 mins and 365days=(60*24*365)minutes

    Scanner input = new Scanner(System.in);

    System.out.print("Input the number of minutes: ");

    double min = input.nextDouble();         //Taling input from the user the no of minutes he wants to convert

    long years = (long) (min / minutesInYear);             //converting to years
    int days = (int) (min / 60 / 24) % 365;                 //converting to days
        
    System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
}
}
