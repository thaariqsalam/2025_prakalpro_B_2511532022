package Pekan3;

import java.util.Scanner;

public class OperatorAlgoritma {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int A1;
        int A2;
        float hasil;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input angka-1 : ");
        A1 = keyboard.nextInt();
        System.out.println("Input angka-2 : ");
        A2 = keyboard.nextInt();
        keyboard.close();

        System.out.println("Operator Penjumlahan");
        hasil = A1 + A2;
        System.out.println("Hasil : " + hasil);

        System.out.println("Operator Pengurangan");
        hasil = A1 - A2;
        System.out.println("Hasil : " + hasil);

        System.out.println("Operator Perkalian");
        hasil = A1 * A2;
        System.out.println("Hasil : " + hasil);

        System.out.println("Operator Pembagian");
        hasil = A1 / A2;
        System.out.println("Hasil : " + hasil);

        System.out.println("Operator Sisa Bagi");
        hasil = A1 % A2;
        System.out.println("Hasil : " + hasil);

        System.out.println();
    }
}
