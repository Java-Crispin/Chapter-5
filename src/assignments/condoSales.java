package assignments;
import java.util.Scanner;
public class condoSales {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final int PARK_VIEW_CONDO_PRICE = 150000;
        final int GOLF_COURSE_VIEW_CONDO_PRICE = 170000;
        final int LAKE_VIEW_CONDO_PRICE = 210000;
        final int GARAGE_PRICE = 5000;
        double userSelection;
        double otherUserSelection;
        int userBill;
        pl("Welcome to the Summerdale Condo Sales office, we have a wide variety of condos available");
        pl("If you would like a condo with a park view, please select option '1'");
        pl("If you would like a condo with a golf course view, please select option '2'");
        pl("If you would like a condo with a lakeside view, please select option '3'");
        pl(">>>>>");
        userSelection = input.nextDouble();
        pl("Would you like a garage, or a parking space with your condo?");
        pl("If you would like a garage, please select option '1'");
        pl("If you would like a parking space, please select option '2'");
        otherUserSelection = input.nextDouble();
        if(userSelection == 1 && otherUserSelection==1)
            userBill = PARK_VIEW_CONDO_PRICE + GARAGE_PRICE;
            pl("You have selected the park view condo with a garage, at the price of $" + userBill);
        else ()
            pl("You have selected the golf course view condo, at the price of $" + GOLF_COURSE_VIEW_CONDO_PRICE+".");
        else if(userSelection ==3)
            pl("You have selected the lakeside view condo, at the price of $" + LAKE_VIEW_CONDO_PRICE+".");
        else
            pl("Please make a correct selection.");
    }
    public static void pl(String p){System.out.println(p);}
}