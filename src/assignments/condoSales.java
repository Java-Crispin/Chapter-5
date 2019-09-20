package assignments;
import java.util.Scanner;
public class condoSales {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final int PARK_VIEW_CONDO = 150000;
        final int GOLF_COURSE_VIEW_CONDO = 170000;
        final int LAKE_VIEW_CONDO = 210000;
        final int PARK_VIEW_GARAGE = 155000;
        final int GOLF_COURSE_GARAGE = 175000;
        final int LAKE_VIEW_GARAGE = 215000;
        double userSelection;
        double otherUserSelection;
        String result = null;
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
        if(userSelection == 1 && otherUserSelection == 1){
            result = "the park view condo with a garage, at the price of $" + PARK_VIEW_GARAGE;
            pl("You selected " + result + ".");
        }
        else if(userSelection == 1 && otherUserSelection == 2){
            result = "the park view condo with a parking space, at the price of $" + PARK_VIEW_CONDO;
            pl("You selected " + result + ".");
        }
        else if(userSelection == 2 && otherUserSelection == 1){
            result = "the golf course view condo with a garage, at the price of $" + GOLF_COURSE_GARAGE;
            pl("You selected " + result + ".");
        }
        else if(userSelection == 2 && otherUserSelection == 2){
            result = "the golf course view condo with a parking space, at the price of $" + GOLF_COURSE_VIEW_CONDO;
            pl("You selected " + result + ".");
        }
        else if(userSelection == 3 && otherUserSelection == 1){
            result = "the lakeside condo with a garage, at the price of $" + LAKE_VIEW_GARAGE;
            pl("You selected " + result + ".");
        }
        else if(userSelection == 3 && otherUserSelection == 2){
            result = "the lakeside condo with a parking space, at the price of $" + LAKE_VIEW_CONDO;
            pl("You selected " + result + ".");
        }
        else {
            pl("Please make a correct selection.");
        }
    }
    public static void pl(String p){System.out.println(p);}
}