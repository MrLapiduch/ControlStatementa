package ControlStatements;
import java.util.Scanner;

public class ElementsOfEquationSquare {

    static float VarAKlaus;
    static float VarBKlaus;
    static float VarCKlaus;
    static float DeltaKlaus;
    static double DeltaSqrtKlaus;
    static int RootKlaus;
    static float VarX1Klaus;
    static float VarX2Klaus;

    public static void main(String[] args) {

        Scanner value1 = new Scanner(System.in);
        System.out.println(" Write number for variable A:");
        VarAKlaus = value1.nextFloat();

        if(VarAKlaus != 0 ) {

            Scanner value2 = new Scanner(System.in);
            System.out.println(" Write number for variable B:");
            VarBKlaus = value2.nextFloat();
            Scanner value3 = new Scanner(System.in);
            System.out.println(" Write number for variable C:");
            VarCKlaus = value3.nextFloat();

            DeltaKlaus = (VarBKlaus * VarBKlaus) - (4 * VarAKlaus * VarCKlaus);
            if(DeltaKlaus > 0 ) {
                DeltaSqrtKlaus = Math.sqrt(DeltaKlaus);
            }

            if(DeltaKlaus < 0) RootKlaus = 0;
            if(DeltaKlaus == 0) RootKlaus = 1;
            if(DeltaKlaus > 0) RootKlaus = 2;

            switch (RootKlaus){
                case 0:
                    System.out.println("There is no X for this Equation Square");
                    break;
                case 1:
                    VarX1Klaus = ((0-VarBKlaus)/(2*VarAKlaus));
                    System.out.println("There is one X for this Equation Square ");
                    System.out.printf("Value for X is :  %.2f %n",VarX1Klaus);
                    break;
                case 2:
                    VarX1Klaus = (((0-VarBKlaus)-(float)DeltaSqrtKlaus)/(2*VarAKlaus));
                    VarX2Klaus = (((0-VarBKlaus)+(float)DeltaSqrtKlaus)/(2*VarAKlaus));
                    System.out.println("There is two X for this Equation Square");
                    System.out.printf("Value of fist X is :  %.2f %n",VarX1Klaus);
                    System.out.printf("Value of second X is :  %.2f %n",VarX2Klaus);
                    break;
            }

        }
        else
        {
            System.out.println("You write 0 as variable A, dont do it");
        }

    }
}
