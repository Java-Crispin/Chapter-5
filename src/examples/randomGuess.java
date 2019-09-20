package examples;
        import java.util.Random;
        import java.util.Scanner;
public class randomGuess {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice;
        int rand_pick = rand.nextInt(10) + 1;
        System.out.println("Please pick a number between 1 and 10.");
        choice = input.nextInt();
        if(choice == rand_pick){
            System.out.println("Congratulations, you are a great guesser.");
        }
        else if(choice > rand_pick){
            System.out.println("Nope, it was lower. " + rand_pick);
        }
        else if(choice < rand_pick){
            System.out.println("Nope, it was higher " + rand_pick);
        }
    }
}