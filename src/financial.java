public class financial {

    public static void main(String[] args) {
        // Target komisi yang ingin dicapai
        final double Target_komisi = 25000.0;
        
        // Variabel untuk menyimpan kondisi saat ini
        double jumlahpenjualan = 0.0;
        double komisisekarang = 0.0;

        // Loop akan terus berjalan, menaikkan penjualan sedikit demi sedikit,
        // sampai komisi yang didapat mencapai target.
        // Peringatan: Ini akan memakan waktu beberapa saat!
        while (komisisekarang < Target_komisi) {
            // Naikkan penjualan sebesar 1 sen di setiap iterasi
            jumlahpenjualan += 0.01; 

            // Hitung ulang seluruh komisi dari awal berdasarkan total penjualan saat ini
            if (jumlahpenjualan <= 5000) {
                // Tingkat 1: komisi 8% untuk penjualan hingga $5,000
                komisisekarang = jumlahpenjualan * 0.08;
            } else if (jumlahpenjualan <= 10000) {
                // Tingkat 2: komisi penuh dari tingkat 1 + 10% untuk sisanya
                komisisekarang = (5000 * 0.08) + ((jumlahpenjualan - 5000) * 0.10);
            } else {
                // Tingkat 3: komisi penuh dari tingkat 1 & 2 + 12% untuk sisanya
                komisisekarang = (5000 * 0.08) + (5000 * 0.10) + ((jumlahpenjualan - 10000) * 0.12);
            }
        }

        System.out.println("Simulasi selesai.");
        // Menggunakan String.format untuk memformat angka menjadi format mata uang
        System.out.println("Penjualan minimum yang dibutuhkan: $" + String.format("%,.2f", jumlahpenjualan));
        System.out.println("Komisi yang dihasilkan: $" + String.format("%,.2f", komisisekarang));
    }
}