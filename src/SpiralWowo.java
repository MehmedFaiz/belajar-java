import java.util.Scanner;

public class SpiralWowo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca jumlah baris (N) dan kolom (M)
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Kasus jika matriks kosong (N atau M adalah 0)
        if (N <= 0 || M <= 0) {
            System.out.println("Wowo bingung, matriksnya kosong");
            sc.close();
            return; // Keluar dari program
        }

        // Membuat matriks dan mengisinya dengan input
        int[][] matriks = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        // Inisialisasi batas-batas matriks
        int atas = 0;
        int bawah = N - 1;
        int kiri = 0;
        int kanan = M - 1;

        // StringBuilder untuk membangun string output secara efisien
        StringBuilder hasilSpiral = new StringBuilder();

        // Loop utama selama masih ada elemen yang bisa dicetak
        while (atas <= bawah && kiri <= kanan) {
            // 1. Cetak baris atas (dari kiri ke kanan)
            for (int i = kiri; i <= kanan; i++) {
                hasilSpiral.append(matriks[atas][i]).append(" ");
            }
            atas++; // Pindahkan batas atas ke bawah

            // 2. Cetak kolom kanan (dari atas ke bawah)
            for (int i = atas; i <= bawah; i++) {
                hasilSpiral.append(matriks[i][kanan]).append(" ");
            }
            kanan--; // Pindahkan batas kanan ke kiri

            // 3. Cetak baris bawah (dari kanan ke kiri)
            // Cek ini diperlukan untuk matriks satu baris atau saat baris habis
            if (atas <= bawah) {
                for (int i = kanan; i >= kiri; i--) {
                    hasilSpiral.append(matriks[bawah][i]).append(" ");
                }
                bawah--; // Pindahkan batas bawah ke atas
            }

            // 4. Cetak kolom kiri (dari bawah ke atas)
            // Cek ini diperlukan untuk matriks satu kolom atau saat kolom habis
            if (kiri <= kanan) {
                for (int i = bawah; i >= atas; i--) {
                    hasilSpiral.append(matriks[i][kiri]).append(" ");
                }
                kiri++; // Pindahkan batas kiri ke kanan
            }
        }

        // Cetak hasil akhir dan hapus spasi ekstra di ujung
        System.out.println(hasilSpiral.toString().trim());

        sc.close();
    }
}