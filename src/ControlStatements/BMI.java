package ControlStatements;
import java.util.Scanner;

public class BMI {

    static float HeightKlaus;
    static float WeightKlaus;

    static float BMIKlaus;

    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        System.out.println(" Write your Height in 'm':");
        HeightKlaus = value1.nextFloat();
        Scanner value2 = new Scanner(System.in);
        System.out.println(" Write your Weight :");
        WeightKlaus = value2.nextFloat();

        BMIKlaus = WeightKlaus / (HeightKlaus * HeightKlaus);

        if (BMIKlaus <16 ){
            System.out.println("Your BMI means you're starving");
        } else if (BMIKlaus>=16 && BMIKlaus<16.99) {
            System.out.println("Your BMI means you're emaciation");
        }else if (BMIKlaus>=17 && BMIKlaus<18.49) {
            System.out.println("Your BMI means you're underweight");
        }else if (BMIKlaus>=18.5 && BMIKlaus<22.99) {
            System.out.println("Your BMI means you're normal, low range");
        }else if (BMIKlaus>=23 && BMIKlaus<24.99) {
            System.out.println("Your BMI means you're normal, high range");
        }else if (BMIKlaus>=25 && BMIKlaus<27.49) {
            System.out.println("Your BMI means you're overweight, low range");
        }else if (BMIKlaus>=27.5 && BMIKlaus<29.99) {
            System.out.println("Your BMI means you're overweight, high range");
        }else if (BMIKlaus>=30 && BMIKlaus<34.99) {
            System.out.println("Your BMI means you're 1st degree obesity");
        }else if (BMIKlaus>=35 && BMIKlaus<39.99) {
            System.out.println("Your BMI means you're 2nd degree obesity");
        }else if (BMIKlaus>=40) {
            System.out.println("Your BMI means you're 3rd degree obesity");
        }


    }
}
