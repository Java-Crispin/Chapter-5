package assignments;
import java.util.Scanner;
public class ascendingAndDescending {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int entry1;
        int entry2;
        int entry3;
        String result = null;
        String result1 = null;
        pl("Please enter the first number.");
        entry1 = input.nextInt();
        pl("Please enter the second number.");
        entry2 = input.nextInt();
        pl("Please enter the third number.");
        entry3 = input.nextInt();
        if(entry1 > entry2 && entry1 > entry3){
            if(entry2 > entry3){
                result = "Ascending order " + entry3 + " " + entry2 + " " + entry1;
                result1 = "Descending order " + entry1 + " " + entry2 + " " + entry3;
            }
           else{
                result = "Ascending order " + entry2 + " " + entry3 + " " + entry1;
                result1 = "Descending order " + entry1 + " " + entry3 + " " + entry2;
            }
        }
        else if(entry2 > entry1 && entry2 > entry3);{
            if(entry1 > entry3){
                result = "Ascending order " + entry3 + " " + entry1 + " " + entry2;
                result1 = "Descending order " + entry2 + " " + entry1 + " " + entry3;
            }
            else{
                result = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
                result1 = "Descending order " + entry2 + " " + entry3 + " " + entry1;
            }
        }
        pl(result + "\n" + result1);
    }
    public static void pl(String p){System.out.println(p);}
}