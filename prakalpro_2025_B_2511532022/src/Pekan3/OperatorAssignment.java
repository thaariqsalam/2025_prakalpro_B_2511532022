package Pekan3;

import java.util.Scanner;

public class OperatorAssignment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int A1;
        int A2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inputkan Angka-1 : ");
        A1 = keyboard.nextInt();
        System.out.println("Inputkan Angka-2 : ");
        A2 = keyboard.nextInt();

        keyboard.close();

        System.out.println("Assignment penambahan :");
        A1 += A2;
        System.out.println("Hasil : " + A1);

        System.out.println("Assignment Pengurangan :");
        A1 -= A2;
        System.out.println("Hasil : " + A1);

        System.out.println("Assignment Perkalian :");
        A1 *= A2;
        System.out.println("Hasil : " + A1);

        System.out.println("Assignment Pembagian :");
        A1 /= A2;
        System.out.println("Hasil : " + A1);

        System.out.println("Assignment Sisa Bagi :");
        A1 %= A2;
        System.out.println("Hasil : " + A2);
    }
}
