public class komisi {

    public static void main(String[] args) {
        // --- Inisialisasi Variabel ---
        double pendapatandasar = 5000.0;
        double targetpendapatan = 30000.0;
        double targetkomisi = targetpendapatan - pendapatandasar; // Targetnya adalah $25,000

        double totalpenjualan;
        
        // --- Kalkulasi Komisi Bertingkat ---
        
        // Hitung komisi maksimal dari tingkat 1 ($5,000 @ 8%)
        double komisitingkat1 = 5000.0 * 0.08; // Hasilnya $400
        
        // Hitung komisi maksimal dari tingkat 2 (berikutnya $5,000 @ 10%)
        double komisitingkat2 = 5000.0 * 0.10; // Hasilnya $500
        
        // Hitung sisa komisi yang masih harus dicapai setelah tingkat 1 dan 2
        // Target $25,000 - $400 - $500 = $24,100
        double komisitersisa = targetkomisi - (komisitingkat1 + komisitingkat2);
        
        // Cari tahu berapa penjualan yang dibutuhkan di tingkat 3 untuk menutupi sisa komisi
        // Sisa komisi ini didapat dari rate 12%
        double penjualandibutuhkan3 = komisitersisa / 0.12;
        
        // Total penjualan adalah gabungan penjualan dari semua tingkat
        totalpenjualan = 5000.0 + 5000.0 + penjualandibutuhkan3;

        // --- Tampilkan Hasil ---
        System.out.println("Target komisi yang harus dicapai: $" + String.format("%,.2f", targetkomisi));
        System.out.println("Untuk mencapai target, penjualan minimum yang dibutuhkan adalah: $" + String.format("%,.2f", totalpenjualan));
    }
}