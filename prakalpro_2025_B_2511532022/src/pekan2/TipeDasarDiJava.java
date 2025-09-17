package pekan2;

public class TipeDasarDiJava {
	public static void main(String[] args) {
        // Tipe data dasar di java int,float,char,boolean
        int jumlahRoti = 15;              // int: digunakan untuk bilangan bulat
        float hargaPerRoti = 3500f;    // float: digunakan untuk bilangan desimal
        char ukuranRoti = 'M';            // char: karakter (ukuran roti, misalnya S, M, L)
        boolean diskon = true;            // boolean: true/false (jika ada maka true, jika tidak maka false)

        // Perhitungan harga roti
        float totalHarga = jumlahRoti * hargaPerRoti;

        // Jika ada diskon maka kurangi harga 10%
        if (diskon) {
            totalHarga = totalHarga - (totalHarga * 0.10f);
        }

        // Output yang akan ditampilkan
        System.out.println("Jumlah Roti   : " + jumlahRoti);
        System.out.println("Harga per Roti: Rp" + hargaPerRoti);
        System.out.println("Ukuran Roti   : " + ukuranRoti);
        System.out.println("Diskon?       : " + diskon);
        System.out.println("Total Harga   : Rp" + totalHarga);
    }
}
