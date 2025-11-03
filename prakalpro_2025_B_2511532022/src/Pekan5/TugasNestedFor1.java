package Pekan5;
public class TugasNestedFor1 {
    public static void cetakBatasAtasOrBawah() {
        System.out.print("#");
        for (int i = 0; i < 16; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
    
    public static void main(String[] args) {
        int N = 4;
        cetakBatasAtasOrBawah();

        // BAGIAN ATAS (4 baris, PIRAMID)
        for (int i = 1; i <= N; i++) {
            System.out.print("|");
            
            // Spasi luar
            for (int k = 0; k < (N - i) * 2; k++) {
                System.out.print(" ");
            }
            
            System.out.print("<>"); 
            
            // Titik tengah
            for (int k = 0; k < (i - 1) * 4; k++) {
                System.out.print(".");
            }
            
            System.out.print("<>");
            
            // Spasi luar (simetris)
            for (int k = 0; k < (N - i) * 2; k++) {
                System.out.print(" ");
            }
            
            System.out.println("|");
        }

        
        // BAGIAN BAWAH  (4 baris, PIRAMID TERBALIK)
        for (int i = N; i >= 1; i--) {
            System.out.print("|");

            // Spasi luar
            for (int k = 0; k < (N - i) * 2; k++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // Titik tengah
            for (int k = 0; k < (i - 1) * 4; k++) {
                System.out.print(".");
            }

            System.out.print("<>");

            // Spasi luar (simetris)
            for (int k = 0; k < (N - i) * 2; k++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        cetakBatasAtasOrBawah();
    }
}