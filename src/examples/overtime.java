package examples;
import java.util.Scanner;
public class overtime {
    public static void main(String[]args){
        double employeeHours;
        double pay = 10.50;
        double total;
        double overtime;
        Scanner input = new Scanner(System.in);
        pl("How many hours did you work?");
        employeeHours = input.nextDouble();
        if (employeeHours > 40){
            overtime = employeeHours - 40;
            total = (pay * 40) + (overtime * (pay * 1.5));
            pl("Gross pay " + total);
        }
        else{
            total = (pay*employeeHours);
            pl("Gross pay " + total);
        }
    }
    public static void pl(String p){System.out.println(p);}
}
