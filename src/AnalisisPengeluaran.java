import java.util.Scanner;

public class AnalisisPengeluaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Baca input
        int N = sc.nextInt();
        int[] pengeluaran = new int[N];
        
        for (int i = 0; i < N; i++) {
            pengeluaran[i] = sc.nextInt();
        }

        // 2. Inisialisasi variabel untuk analisis
        int jumlahHemat = 0;
        int jumlahNormal = 0;
        int jumlahBoros = 0;
        long totalPengeluaran = 0;
        
        // Asumsikan data pertama sebagai min & max sementara
        int pengeluaranTertinggi = pengeluaran[0];
        int pengeluaranTerendah = pengeluaran[0];

        // 3. Proses setiap data pengeluaran dalam satu loop
        for (int harian : pengeluaran) {
            // Kategorikan dan hitung jumlah hari sesuai Note
            if (harian < 50000) {
                jumlahHemat++;
            } else if (harian < 100000) {
                jumlahNormal++;
            } else {
                jumlahBoros++;
            }

            // Tambahkan ke total pengeluaran
            totalPengeluaran += harian;

            // Cek untuk pengeluaran tertinggi
            if (harian > pengeluaranTertinggi) {
                pengeluaranTertinggi = harian;
            }

            // Cek untuk pengeluaran terendah
            if (harian < pengeluaranTerendah) {
                pengeluaranTerendah = harian;
            }
        }

        // 4. Cetak hasil sesuai format
        System.out.println(jumlahHemat);
        System.out.println(jumlahNormal);
        System.out.println(jumlahBoros);
        System.out.println(totalPengeluaran);
        System.out.println(pengeluaranTertinggi + " " + pengeluaranTerendah);

        sc.close();
    }
}