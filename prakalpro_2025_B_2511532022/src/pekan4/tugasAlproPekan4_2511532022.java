package pekan4;
import java.util.Scanner;
import java.lang.Math; // Untuk Math.ceil()

public class tugasAlproPekan4_2511532022 {
	    // --- Aturan Perhitungan yang Digunakan (Wajib dicantumkan di laporan):
	    // 1. Biaya Dasar: 15.000 (untuk 1kg pertama), +5.000/kg kelebihan. Berat dibulatkan ke atas.
	    // 2. Biaya Jarak: 1.500/km.
	    // 3. Biaya Layanan: Reguler (0%), Express (50%), Same Day (80%) dari Subtotal.
	    // 4. Biaya Jenis Paket: Dokumen (0), Barang Biasa (5.000), Elektronik (15.000).
	    // 5. Diskon: 10% jika Total Sebelum Diskon >= 100.000.
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Deklarasi variabel
	        String namaPengirim;
	        double beratPaket;
	        int jarakKirim;
	        int jenisLayanan;
	        int jenisPaket;
	        
	        // Variabel perhitungan
	        int beratBulat;
	        double biayaDasar;
	        double biayaJarak;
	        double subtotal;
	        double persenLayanan = 0;
	        double biayaLayanan;
	        double biayaJenisPaket = 0;
	        double totalSebelumDiskon;
	        double diskon;
	        double totalAkhir;
	        String namaLayanan = "";
	        String namaPaket = "";

	        // --- Input Data ---
	        System.out.println("=============================================");
	        System.out.println("  SISTEM PERHITUNGAN BIAYA PENGIRIMAN PAKET  ");
	        System.out.println("=============================================");
	        
	        // Input dibuat sejajar menggunakan spasi manual
	        System.out.print("Nama Pengirim           : "); 
	        namaPengirim = scanner.nextLine();

	        System.out.print("Berat Paket (kg)        : ");
	        beratPaket = scanner.nextDouble();

	        System.out.print("Jarak Pengiriman (km)   : ");
	        jarakKirim = scanner.nextInt();
	        
	        System.out.println("\n--- Pilihan Layanan ---");
	        System.out.println("   1 = Reguler, 2 = Express, 3 = Same Day");
	        System.out.print("Pilih Layanan (1-3)     : ");
	        jenisLayanan = scanner.nextInt();
	        
	        System.out.println("\n--- Pilihan Jenis Paket ---");
	        System.out.println("   1 = Dokumen, 2 = Barang Reguler, 3 = Barang Elektronik");
	        System.out.print("Pilih Jenis Paket (1-3) : ");
	        jenisPaket = scanner.nextInt();
	        
	        // --- Proses Perhitungan ---

	        // 1. Hitung Berat yang Dibulatkan ke atas
	        beratBulat = (int) Math.ceil(beratPaket); 

	        // 2. Hitung Biaya Dasar (if-else)
	        if (beratBulat <= 1) {
	            biayaDasar = 15000;
	        } else {
	            biayaDasar = 15000 + ((beratBulat - 1) * 5000); 
	        }

	        // 3. Hitung Biaya Jarak
	        biayaJarak = jarakKirim * 1500; 

	        // 4. Hitung Subtotal
	        subtotal = biayaDasar + biayaJarak;

	        // 5. Tentukan Biaya Layanan (switch-case)
	        switch (jenisLayanan) {
	            case 1: persenLayanan = 0.0; namaLayanan = "Reguler"; break;
	            case 2: persenLayanan = 0.50; namaLayanan = "Express"; break;
	            case 3: persenLayanan = 0.80; namaLayanan = "Same Day"; break;
	            default: persenLayanan = 0.0; namaLayanan = "TIDAK VALID";
	        }
	        biayaLayanan = subtotal * persenLayanan;
	        
	        // 6. Tentukan Biaya Jenis Paket (if-else if)
	        if (jenisPaket == 1) { biayaJenisPaket = 0; namaPaket = "Dokumen"; }
	        else if (jenisPaket == 2) { biayaJenisPaket = 5000; namaPaket = "Barang Reguler"; }
	        else if (jenisPaket == 3) { biayaJenisPaket = 15000; namaPaket = "Barang Elektronik"; }
	        else { biayaJenisPaket = 0; namaPaket = "TIDAK VALID"; }

	        // 7. Hitung Total Sebelum Diskon
	        totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;

	        // 8. Hitung Diskon (if-else)
	        if (totalSebelumDiskon >= 100000) {
	            diskon = totalSebelumDiskon * 0.10; 
	        } else {
	            diskon = 0;
	        }

	        // 9. Hitung TOTAL BIAYA Akhir
	        totalAkhir = totalSebelumDiskon - diskon;
	        
	        // --- Output Hasil Perhitungan (Menggunakan System.out.println) ---
	        
	        // Bulatkan semua biaya ke bilangan bulat terdekat (long)
	        long dasar = Math.round(biayaDasar);
	        long jarak = Math.round(biayaJarak);
	        long sub = Math.round(subtotal);
	        long layanan = Math.round(biayaLayanan);
	        long jenis = Math.round(biayaJenisPaket);
	        long totalSblmDisc = Math.round(totalSebelumDiskon);
	        long disc = Math.round(diskon);
	        long totalA = Math.round(totalAkhir);

	        System.out.println("\n=============================================");
	        System.out.println("         BIAYA PENGIRIMAN PAKET              ");
	        System.out.println("=============================================");
	        
	        // Output non-biaya
	        System.out.println("Nama Pengirim           : " + namaPengirim);
	        System.out.println("Berat Paket             : " + String.format("%.1f", beratPaket) + " kg (Bulat: " + beratBulat + " kg)");
	        System.out.println("Jarak Pengiriman        : " + jarakKirim + " km");
	        System.out.println("Jenis Layanan           : " + namaLayanan);
	        System.out.println("Jenis Paket             : " + namaPaket);
	        System.out.println("---------------------------------------------");
	        
	        // Output Biaya (tanpa pemisah 3 digit)
	        System.out.println("Biaya Dasar             : Rp " + dasar);
	        System.out.println("Biaya Jarak             : Rp " + jarak);
	        System.out.println("Subtotal                : Rp " + sub);
	        System.out.println("Biaya Layanan("+(int)(persenLayanan * 100)+"%)      : Rp " + layanan);
	        System.out.println("Biaya Jenis Paket       : Rp " + jenis);
	        System.out.println("Total Sebelum Disc.     : Rp " + totalSblmDisc);
	        System.out.println("Diskon (10%)            : Rp " + disc);
	        System.out.println("--------------------------------------------");
	        System.out.println("TOTAL BIAYA             : Rp " + totalA);
	        System.out.println("============================================");
	        
	        scanner.close();
	    }
	}