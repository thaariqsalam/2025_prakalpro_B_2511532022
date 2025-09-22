package Pekan3;

import java.util.Scanner;
public class OperatorRelasional {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int A1;
        int A2;
        boolean hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukan Angka-1 :");
        A1 = keyboard.nextInt();
        System.out.println("Masukan Angka-2 :");
        A2 = keyboard.nextInt();

        keyboard.close();

        hasil = A1 > A2;
        System.out.println("Apakah A1 > A2 :" + hasil);
        hasil = A1 < A2;
        System.out.println("Apakah A1 < A2 :" + hasil);
        hasil = A1 >= A2;
        System.out.println("Apakah A1 >= A2 :" + hasil);
        hasil = A1 <= A2;
        System.out.println("Apakah A1 <= A2 :" + hasil);
        hasil = A1 == A2;
        System.out.println("Apakah A1 == A2 :" + hasil);
        hasil = A1 != A2;
        System.out.println("Apakah A1 != A2 :" + hasil);
    }
}
