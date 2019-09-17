package examples;
import java.util.Scanner;
public class ageInsultGenerator {
    public static void main(String[]args){
        //User enters age and then it spits back an insult
        int age;
        Scanner input = new Scanner(System.in);
        pl("Please enter your age.");
        age = input.nextInt();
        if(age<12){
            pl("Did your mother help you type that?");
        }
        else if(age>=12&&age<19){
            pl("Shouldn't you be doing your homework?");
        }
        else if(age>=19&&age<25){
            pl("Go get a job you bum.");
        }
        else if(age>=25&&age<35){
            pl("Shouldn't you be drinking a large salted caramel mocha latte right now?");
        }
        else if(age>=35&&age<45){
            pl("Aren't you supposed to be yelling at the neighbor for mowing your lawn?");
        }
        else if(age>=45&&age<55){
            pl("Who taught you to use a computer?");
        }
        else if(age>55){
            pl("have your grandchildren visited recently?");
        }
    }
    public static void pl(String p){System.out.println(p);}
}