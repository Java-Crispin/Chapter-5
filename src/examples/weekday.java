package examples;
import java.util.Scanner;
public class weekday {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String day;
        String result;
        pl("Enter teh day of the week.");
        day = input.next();
        switch(day){
            case"Monday":
                result = "Reserve a room for the meeting on Friday";
                break;
            case"Tuesday":
                result = "Prepare your powerpoint presentation for the meeting on Friday";
                break;
            case "Wednesday":
                result = "Send out reminders for the meeting on Friday";
                break;
            case "Thursday":
                result = "Buy snacks for the meeting on Friday";
                break;
            case "Friday":
                result = "Good luck at your meeting";
                break;
            default:
                result = "Invalid input";
        }
        pl(result);
    }
    public static void pl(String p){System.out.println(p);}
}