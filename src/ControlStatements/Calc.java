package ControlStatements;
import java.util.Scanner;

public class Calc {
    static float NumberOneKlaus;
    static float NumberTwoKlaus;
    static float SumResultKlaus;
    static float DifResultKlaus;
    static float MultipliResultKlaus;
    static float DivResultKlaus;
    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        System.out.println(" Write your first number :");
        NumberOneKlaus = value1.nextFloat();
        Scanner value2 = new Scanner(System.in);
        System.out.println(" Write your second number :");
        NumberTwoKlaus = value2.nextFloat();

        SumResultKlaus = NumberOneKlaus + NumberTwoKlaus;
        DifResultKlaus = NumberOneKlaus - NumberTwoKlaus;
        MultipliResultKlaus = NumberOneKlaus * NumberTwoKlaus;
        DivResultKlaus = NumberOneKlaus / NumberTwoKlaus;

        System.out.printf("Your Sum of two numbers is : %.2f %n",SumResultKlaus);
        System.out.printf("Your Difference of two numbers is : %.2f %n",DifResultKlaus);
        System.out.printf("Your Multiply of two numbers is : %.2f %n",MultipliResultKlaus);
        System.out.printf("Your Division of two numbers is : %.2f %n",DivResultKlaus);
    }
}
