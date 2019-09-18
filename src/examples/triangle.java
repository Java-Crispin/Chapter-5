package examples;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Triangle program
        //Solving for right, isosceles, and equilateral triangles
        //Solve triangle sides, perimeter, and area
        int choice;
        pl("What kind of triangle are you trying to solve? \n 1-Right Triangle \n " +
                "2-Isosceles \n 3-Equilateral \n >>>>");
        choice = input.nextInt();
        if (choice == 1) {
            rightTriangle();
        } else if (choice == 2) {
            isoscelesTriangle();
        } else if (choice == 3) {
            equilateralTriangle();
        } else if (choice > 3) {
            pl("Please choose 1, 2, or 3.");
        }
    }

    public static void rightTriangle() {
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;
        double side3;
        pl("Would you like to solve for a side, or perimeter?");
        choice = input.next();
        if (choice.equalsIgnoreCase("Side")) {
            pl("Which side do you want to solve for\n" +
                    "A-Side\nB-Side\nC-Side");
            choice = input.next();
        } else if (choice.equalsIgnoreCase("Perimeter")) {
            pl("Please enter the first side of the triangle.");
            side1 = input.nextDouble();
            pl("Please enter the second side of the triangle.");
            side2 = input.nextDouble();
            pl("Please enter the third side of the triangle");
            side3 = input.nextDouble();
            triangleMathPerimeter(side1, side2, side3);
        }
        if (choice.equalsIgnoreCase("A")) {
            pl("Please enter for side B");
            side1 = input.nextDouble();
            pl("Please enter for side C");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        if (choice.equalsIgnoreCase("B")) {
            pl("Please enter for side A");
            side1 = input.nextDouble();
            pl("Please enter for side C");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        if (choice.equalsIgnoreCase("C")) {
            pl("Please enter for side A");
            side1 = input.nextDouble();
            pl("Please enter for side B");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }
    }

    public static void triangleMathPerimeter(double side1, double side2, double side3) {
        double p;
        p = (side1 + side2 + side3);
        pl("The perimeter of the triangle is " + p + ".");
    }

    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        pl("The side " + choice + " is " + notC + ".");
    }

    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double c;
        c = Math.sqrt((side2 * side2) + (side1 * side1));
        pl("The side " + choice + " is " + c + ".");
    }

    public static void isoscelesTriangle() {
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;
        double side3;
        double side;
        double base;
        pl("Would you like to solve for height, or perimeter?");
        choice = input.next();
        if (choice.equalsIgnoreCase("Height")) {
            pl("Please enter the side length of the triangle.");
            side = input.nextDouble();
            pl("Please enter the base length of the triangle");
            base = input.nextDouble();
            isoscelesTriangleMath(side, base);

        } else if (choice.equalsIgnoreCase("Perimeter")) {
            pl("Please enter the first side of the triangle.");
            side1 = input.nextDouble();
            pl("Please enter the second side of the triangle.");
            side2 = input.nextDouble();
            pl("Please enter the third side of the triangle");
            side3 = input.nextDouble();
            triangleMathPerimeter(side1, side2, side3);
        }
    }

    public static void isoscelesTriangleMath(double side, double base) {
        double height;
        height = Math.sqrt((side * side) - ((base * base) / 4));
        pl("The height of the triangle is " + height);
    }
    public static void equilateralTriangle() {
        Scanner input = new Scanner(System.in);
        String choice;
        double side;
        double side1;
        double side2;
        double side3;
        pl("Would you like to solve for height, or perimeter?");
        choice = input.next();
        if (choice.equalsIgnoreCase("Height")) {
            pl("Please enter the side length of the triangle.");
            side = input.nextDouble();
            equilateralTriangleMath(side);

        } else if (choice.equalsIgnoreCase("Perimeter")) {
            pl("Please enter the first side of the triangle.");
            side1 = input.nextDouble();
            pl("Please enter the second side of the triangle.");
            side2 = input.nextDouble();
            pl("Please enter the third side of the triangle");
            side3 = input.nextDouble();
            triangleMathPerimeter(side1, side2, side3);
        }
    }
    public static void equilateralTriangleMath(double side){
        double altitude;
        altitude = ((1/2)*(Math.sqrt(3))*(side*side));
        pl("The height of the triangle is " + altitude);
    }
    public static void pl(String p){System.out.println(p);}
}