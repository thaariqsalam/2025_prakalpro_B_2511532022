package pekan4;

import java.util.Scanner;

public class ifelse1 {
	public static void main(String[]args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.print("Input IPK Anda = ");
		IPK=input.nextDouble();
		input.close();
		if (IPK >2.75) {
			System.out.println("Anda lulus Sangat Memuaskan dengan IPK" + IPK);
		}
		else {
			System.out.println("Anda tidak lulus");
		}
	}
}