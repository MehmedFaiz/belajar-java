import java.math.BigInteger;

public class MersennePrimes {

    public static void main(String[] args) {
        
        // 1. Cetak header tabel
        System.out.printf("%-10s%s\n", "p", "2^p - 1");
        System.out.println("-------------------------");

        // 2. Loop 'p' dari 2 sampai 100
        for (int p = 2; p <= 100; p++) {
            
            // 3. Cek Pertama: Apakah 'p' itu sendiri bilangan prima?
            if (isPrime(p)) {
                
                // 4. Jika 'p' prima, hitung 2^p - 1 menggunakan BigInteger
                BigInteger m = calculateMersenne(p);

                // 5. Cek Kedua: Apakah hasil (2^p - 1) juga prima?
                // Kita gunakan isProbablePrime(100)
                // Ini adalah tes prima yang sangat efisien untuk angka besar.
                // Angka 100 adalah "certainty" (tingkat keyakinan),
                // yang sudah lebih dari cukup.
                if (m.isProbablePrime(100)) {
                    
                    // 6. Jika keduanya prima, cetak hasilnya
                    System.out.printf("%-10d%s\n", p, m);
                }
            }
        }
    }

    /**
     * Method helper untuk menghitung 2^p - 1 menggunakan BigInteger.
     * @param p Angka pangkat (integer)
     * @return Hasil 2^p - 1 sebagai BigInteger
     */
    public static BigInteger calculateMersenne(int p) {
        // Buat BigInteger dari angka 2
        BigInteger two = BigInteger.valueOf(2);

        // Hitung 2^p lalu kurangi 1
        // BigInteger.ONE adalah konstanta untuk angka 1
        return two.pow(p).subtract(BigInteger.ONE);
    }

    /**
     * Method helper untuk mengecek bilangan prima (untuk angka int kecil <= 100)
     * @param n Angka yang akan dicek
     * @return true jika prima, false jika tidak
     */
    public static boolean isPrime(int n) {
        // 0 dan 1 bukan prima
        if (n < 2) {
            return false;
        }
        // 2 adalah satu-satunya bilangan prima genap
        if (n == 2) {
            return true;
        }
        // Bilangan genap selain 2 pasti bukan prima
        if (n % 2 == 0) {
            return false;
        }
        // Cek bilangan ganjil saja, sampai akar kuadrat dari n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Ditemukan pembagi, bukan prima
            }
        }
        return true; // Tidak ditemukan pembagi, ini prima
    }
}
