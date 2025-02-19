//Program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter the coefficient for quadratic term: ");
        double a = reader.nextDouble();
        System.out.print("\nEnter the coefficient for linear term: ");
        double b = reader.nextDouble();
        System.out.print("\nEnter the constant term: ");
        double c = reader.nextDouble();
        reader.close();
        double d = b*b - 4*a*c;

        if (d > 0)
        {
            double root1 = (-b + Math.pow(d, 0.5))/(2*a);
            double root2 = (-b - Math.pow(d, 0.5))/(2*a);
            System.out.print("Both roots are real which are " + root1 + " and " + root2);
        }
        else if (d == 0)
        {
            System.out.print("Both roots are real and equal which is " + -b/(2*a));
        }
        else
        {
            System.out.print("Both roots are imaginary.");
        }
    }
}
