import java.util.Scanner;

public class BudiBakery {


    public static int hitungPendapatanHarian(int jumlah, int hargaJual) {
       int Pendapatan = jumlah * hargaJual;
        return Pendapatan; // ganti dengan perhitungan yang benar
    }

  
    public static int hitungKeuntunganHarian(int jumlah, int hargaJual, int biayaProduksi) {
        int Pendapatan = (jumlah * hargaJual) - biayaProduksi;
        return Pendapatan; // ganti dengan perhitungan yang benar
    }

    
    public static int totalKeuntunganMingguan(int[] keuntungan, int index) {
       if (index == keuntungan.length){
        return 0;
       }
       
        // Gunakan rekursi untuk menjumlahkan elemen array keuntungan
        // Basis: jika index == keuntungan.length, kembalikan 0
        return keuntungan[index] + totalKeuntunganMingguan(keuntungan, index + 1); // ganti dengan logika rekursif
    }

    
    public static void tampilkanLaporan(int totalPendapatan, int totalKeuntungan) {
        // Tampilkan total pendapatan dan total keuntungan mingguan
        System.out.println("Total Pendapatan Mingguan: " + totalPendapatan);
        System.out.println("Total Keuntungan Mingguan: " + totalKeuntungan);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // jumlah hari penjualan
        int[] keuntungan = new int[n];
        int totalPendapatan = 0;
        int[] pendapatan = new int[n];
        for(int i = 0; i<n;i++){
            int jumlah = in.nextInt();
            int hargaJual = in.nextInt();
            int biayaProduksi = in.nextInt();


            pendapatan[i] = hitungPendapatanHarian(jumlah, hargaJual);
            keuntungan[i] = hitungKeuntunganHarian(jumlah, hargaJual, biayaProduksi);

            totalPendapatan += pendapatan[i];
            

            System.out.println("Hari ke-" + (i + 1) + " -> Pendapatan: Rp" + pendapatan[i] + "| Keuntungan: Rp" + keuntungan[i]);
        }

        int totalKeuntungan = totalKeuntunganMingguan(keuntungan, 0);

        tampilkanLaporan(totalPendapatan, totalKeuntungan);
        in.close();
    }
}
