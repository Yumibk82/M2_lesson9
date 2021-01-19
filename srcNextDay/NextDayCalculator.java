import java.util.Arrays;
import java.util.Scanner;
public class NextDayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a day ");
        int date = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        int[] arr = new int[3];
        arr[0] = date;
        arr[1] = month;
        arr[2] = year;

        if (isCorrectDate(date, month, year)) {
            int tempDate = date;
            int tempMonth = month;
            int temYear = year;
            nextDay(tempDate, tempMonth, temYear);
        } else {
            System.out.println("Date is not correct");
        }
    }

    public static int checkMonth(int month, int year) {
        int numOfDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numOfDay = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDay = 29;
                } else numOfDay = 28;
                break;
        }
        return numOfDay;
    }

    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static String nextDay(int date, int month, int year) {
        if (date < checkMonth(month, year)) {
            date++;
        } else if((date==31)&&(month==12)){
            date=1;
            month=1;
            year++;
        } else if (date == checkMonth(month, year)) {
            date = 1;
            month++;}
        else if (date > checkMonth(month, year)) {
            date = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        int[] arr={date,month,year};
        return Arrays.toString(arr);
    }
    public static boolean isCorrectDate(int date,int month,int year){
        boolean result=true;
        if(!(year>0)){
            return false;
        }
        if(!(month>=1)&&month<=12){
            return false;
        }
        if(!(date>=1)&&date<=checkMonth(month,year)){
            return false;
        }
        return result;
    }
}
