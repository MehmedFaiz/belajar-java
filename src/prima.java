public class prima {
    public static void main(String[] args) {
        System.out.println("mencari semua pasangan twin prime di bawah 1000");
        // Loop utama dari 3 hingga 998 (karena 3 adalah prime pertama)
        // Kita hanya perlu cek angka ganjil, jadi i += 2
        for (int i = 3; i <= 1000 - 2; i+=2) {
            // Periksa apakah i dan i+2 keduanya adalah bilangan prima
            if (isPrime(i) && isPrime(i + 2)) {
                //Cetak pasangan jika keduanya prima
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    /**
     * Method untuk mengecek apakah sebuah angka adalah bilangan prima.
     * @param number Angka yang akan dicek.
     * @return true jika prima, false jika tidak.
     */
    public static boolean isPrime(int num) {
        //Angka kurang dari atau sama dengan 1 bukan prima
        if (num <= 1) return false;
         // Cek pembagi dari 2 sampai akar kuadrat dari angka
        for (int i = 2; i <= Math.sqrt(num); i++) {
        //Jika ada satu saja pembagi, maka bukan prima
            if (num % i == 0) return false;
        }
        //Jika tidak ditemukan pembagi, maka angka tersebut prima
        return true;
    }
}
