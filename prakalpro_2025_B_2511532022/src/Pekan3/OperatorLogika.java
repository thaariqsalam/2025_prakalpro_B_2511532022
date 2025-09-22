package Pekan3;

import java.util.Scanner;

public class OperatorLogika {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean A1;
        boolean A2;
        boolean c;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input = ");
        A1 = keyboard.nextBoolean();
        System.out.println("Input = ");
        A2 = keyboard.nextBoolean();

        keyboard.close();

        System.out.println("A1 = " + A1);
        System.out.println("A2 = " + A2);

        System.out.println(" Konjungsi ");
        c = A1 && A2;
        System.out.println("True and False : " + c);

        System.out.println(" Disjungsi ");
        c = A1 || A2;
        System.out.println("True or False : " + c);

        System.out.println(" Negasi ");
        c = !A1;
        System.out.println("Bukan True:" + c);
    }
}
