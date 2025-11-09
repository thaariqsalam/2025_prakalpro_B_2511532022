package pekan6_2511532022;
import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511532022 {
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int jumlahPercobaan = 0;
		boolean lemparLagi = true;

		do {
			jumlahPercobaan++;
			int dadu1 = random.nextInt(6) + 1;
			int dadu2 = random.nextInt(6) + 1;
			int total = dadu1 + dadu2;

			System.out.println(dadu1 + " + " + dadu2 + " = " + total);

			if (total == 7) {
				System.out.println("Tebakan Anda Benar");
				System.out.println("Anda menang setelah " + jumlahPercobaan + " percobaan.");
				lemparLagi = false;
			} 
			else {
				String pilihan;
				do {
					System.out.print("Apakah Anda mau lempar dadu lagi? (ya/tidak): ");
					pilihan = scanner.next().toLowerCase();

					if (pilihan.equals("tidak")) {
						System.out.println("Anda gagal menang");
						lemparLagi = false;
						break;
					} else if (pilihan.equals("ya")) {
						break;
					} else {
						System.out.println("Input tidak valid. Mohon masukkan 'ya' atau 'tidak'.");
					}
				} 
				while (true);
			}

		} while (lemparLagi);

		scanner.close();
	}
}
