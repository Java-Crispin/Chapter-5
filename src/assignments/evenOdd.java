package assignments;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        //the user enters a number and it will display even or odd as a result
        Scanner input = new Scanner(System.in);
        int numEntered;
        String result;
        pl("Please enter a number.");
        numEntered = input.nextInt();
        if (numEntered % 2 == 0)
            result = numEntered + " is an even number.";
        else
            result = numEntered + " is an odd number.";
        pl(result);
    }
    public static void pl(String p){System.out.println(p);}
}