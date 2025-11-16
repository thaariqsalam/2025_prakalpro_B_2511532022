package tugasAlproPekan7_2511532022;
import java.util.Scanner;
public class tugasAlproPekan7_2511532022 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		Akun objectAkunBaru = new Akun("", "", "", 0);
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username: ");
		objectAkunBaru.setUsername (scanner.nextLine());
		System.out.print("Masukkan Password: ");
		objectAkunBaru.setPassword (scanner.nextLine());
		System.out.print("Masukkan Email: ");
		objectAkunBaru.setEmail (scanner.nextLine());
		System.out.print("Masukkan PIN (6 angka): ");
		objectAkunBaru.setPinAngka (scanner.nextInt());
		scanner.close();
		
// panggil semua HELPER METHOD 
		boolean isPassOk= objectAkunBaru.isPasswordValid();
		boolean isEmailOk= objectAkunBaru.isEmailValid();
		boolean isPinOk= objectAkunBaru.isPinAngkaValid();
		int y =10;
		String z ="10";
		
		if (isPassOk && isEmailOk && isPinOk) {
			System.out.println("\n--- REGISTRASI AKUN BERHASIL --- ");
			System.out.println("Akun untuk \"" + objectAkunBaru.getUsername() + "\" berhasil dibuat.");
			
			System.out.println("\n--- DETAIL AKUN --- ");
			System.out.println("Username (Lowercase)\t: " + objectAkunBaru.getUsername().toLowerCase());
			System.out.println("Email (Uppercase)\t: " + objectAkunBaru.getEmail().toUpperCase());
			System.out.println("ID Pengguna (Gabungan)\t: " + objectAkunBaru.getUsername().concat(String.valueOf(objectAkunBaru.getPinAngka())));
			
			System.out.println("\n--- Uji Tipe Data (PIN Anda: " + objectAkunBaru.getPinAngka() + ") ---");
			System.out.print("PIN (int) + 10 \t\t= ");
			System.out.println(objectAkunBaru.getPinAngka()+ y);
			System.out.println("PIN (String) + 10 \t= " + objectAkunBaru.getPinAngka() + z );
			
		} else {
			System.out.println("\n--- REGISTRASI GAGAL ----");
			if (!isPassOk) {
				System.out.println("Password Anda \"" + objectAkunBaru.getPassword() + "\" tidak valid (Password minimal 8 karakter).");
			}
			if (!isEmailOk) {
				System.out.println("Email Anda \"" + objectAkunBaru.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
			}
			if (!isPinOk) {
				System.out.println("PIN Anda \"" + objectAkunBaru.getPinAngka() + "\" tidak valid (harus tepat 6 angka)");
			}
			System.out.println("Silahkan coba lagi ");
		}
	}
}
