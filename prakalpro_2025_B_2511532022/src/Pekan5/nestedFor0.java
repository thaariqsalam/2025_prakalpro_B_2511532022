package Pekan5;

public class nestedFor0 {
public static void main(String[]args) {
	for (int line = 1; line<=5; line++) {
		for (int j = 1; j <= (-1 * line + 5); j++) {
			System.out.print(".");
			}
		System.out.print(line);
		System.out.println();
	}
}
}