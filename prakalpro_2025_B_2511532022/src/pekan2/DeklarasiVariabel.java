package pekan2;

public class DeklarasiVariabel {
	/*program java
	 * latihan
	 * tentang pendeklarasian variabel
	 */
	static int umur=25; /*perhatikan penulisan nama variabel*/
	public static void main (String[] args ) {
		int kode;
		boolean isDibawahUmur; /*perhatikan penulisan*/
		kode = 1234; /*pengisian variabel*/
		double gaji; /*deklarasi variabel dapat dimana saja*/
		gaji = 5500000.23; 
		isDibawahUmur= true;
		System.out.println(" Status: " + isDibawahUmur);
		System.out.println(" kode : " + kode);
		System.out.println(" umur: " + umur);
		System.out.println(" gaji: " + gaji);
	}
}
