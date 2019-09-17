package examples;
import java.util.Scanner;
public class triangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //Triangle program
        //Solving for right, isosceles, and equilateral triangles
        //Solve triangle sides, perimeter, and area
        int choice;
        pl("What kind of triangle are you trying to solve? \n 1-Right Triangle \n " +
        "2-Isosceles \n 3-Equilateral \n >>>>");
        choice = input.nextInt();
        if (choice==1){
            rightTriangle();
        }
        else if(choice==2){
            
        }
        else if(choice==3){

        }
    }
    public static void rightTriangle(){

    }
    public static void solvePerimeter(){

    }
    public static void solveArea(){

    }
    public static void pl(String p){System.out.println(p);}
}
//askldf;aksjdnf;klasnhdf;kasndf