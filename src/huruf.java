import java.util.Scanner;

public class huruf {

    public static void main(String[] args) {
        // Siapkan untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Siapkan variabel penghitung
        int jumlahVokal = 0;
        int jumlahKonsonan = 0;

        // Lakukan perulangan untuk setiap karakter dalam kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            // Ambil satu karakter dari kalimat
            char karakter = kalimat.charAt(i);

            // Ubah karakter menjadi huruf kecil agar pengecekan lebih mudah
            karakter = Character.toLowerCase(karakter);

            // Cek apakah karakter adalah huruf
            if (karakter >= 'a' && karakter <= 'z') {
                //Jika itu huruf, cek apakah vokal atau konsonan
                if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
                    jumlahVokal++; // Tambah 1 ke penghitung vokal
                } else {
                    jumlahKonsonan++; // Tambah 1 ke penghitung konsonan
                }
            }
            // Jika karakter bukan huruf (spasi, angka, dll.), kita abaikan saja
        }

        //Tampilkan hasilnya
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
        System.out.println("Jumlah huruf konsonan: " + jumlahKonsonan);
        
        input.close();
    }
}
