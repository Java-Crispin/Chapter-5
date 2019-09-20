package assignments;
import java.util.Scanner;
public class cellPhoneService {
    public static void main(String[]args){
        int minUsed;
        int txtUsed;
        int gbUsed;
        String result = null;
        Scanner input = new Scanner(System.in);
        pl("How many minutes are you going to use each month?");
        minUsed = input.nextInt();
        pl("How many text messages are you going to send?");
        txtUsed = input.nextInt();
        pl("How many gigabytes are you going to use?");
        gbUsed = input.nextInt();
        if(minUsed < 500 && txtUsed == 0 && gbUsed == 0){
            result = "Plan A, at $49 per month.";
        }
        else if(minUsed < 500 && txtUsed >=1 && txtUsed <= 99 && gbUsed ==0){
            result = "Plan B, at $55 per month.";
        }
        else if(minUsed > 500 && txtUsed <= 100 && gbUsed == 0){
            result = "Plan C, at $61 per month.";
        }
        else if(minUsed > 500 && txtUsed > 100 && gbUsed == 0){
            result = "Plan D, at $70 per month.";
        }
        else if(minUsed > 500 && txtUsed > 100 && gbUsed < 2){
            result = "Plan E, at $79 per month.";
        }
        else if(minUsed > 500 && txtUsed > 100 && gbUsed > 2){
            result = "Plan F, at $87 per month.";
        }
        pl("Based on how much data you will use we recommend " + result);
    }
    public static void pl(String p){System.out.println(p);}
}
