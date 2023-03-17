/*
 * Printing month of the year using switch
Write a program to get the month as integer and year as integer from user and display what month it corresponds and number of days in that month .

INPUT AND OUTPUT CONSTRAINTS :
 Input consists of 2 integers month and year.
 Output consists of name of month and number of days. Output "Invalid Month" if it is not valid.
SAMPLE INPUT AND OUTPUT 1:
Enter the month:
2
Enter the year:
2000
February of 2000 has 29 days.

SAMPLE INPUT AND OUTPUT 2:
Enter the month:
8
Enter the year:
1992
August of 1992 has 31 days.
 */
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the month:");
            int month=sc.nextInt();
            String mon = "";
            System.out.println("Enter the year:");
            int year = sc.nextInt();
            int days = 0;
            boolean monValid=true;
            switch (month) {
                case 1:days=31;
                        mon = "January";
                        break;
                case 2: 
                        boolean isLeapYear=false;
                        isLeapYear = (year % 4 == 0);
                        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
                        if (isLeapYear) {
                            days=29;
                        } else{
                            days=28;
                        }
                        mon = "February";
                        break;
                case 3: days=31;
                        mon="March";
                        break;
                case 4:days=30;
                        mon="April";
                        break;
                case 5:days=31;
                        mon="May";
                        break;
                case 6:days=30;
                        mon="June";
                        break;
                case 7:days=31;
                        mon="July";
                        break;
                case 8:days=31;
                        mon="August";
                        break;
                case 9:days=30;
                        mon="September";
                        break;
                case 10:days=31;
                        mon="October";
                        break;
                case 11:days=30;
                        mon="November";
                        break;
                case 12:days=31;
                        mon="December";
                        break;
                default:mon="Invalid Month";
                        monValid=false;
                    break;
            }
            if(monValid){
                System.out.println(mon+" of "+year+ " has "+days+" days.");
            }
            else{
                System.out.println(mon);
            }
        }
    }
}

