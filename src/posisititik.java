import java.util.Scanner;

public class posisititik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta dan membaca 6 koordinat dari pengguna
        System.out.print("Masukkan tiga titik untuk p0, p1, dan p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Menutup scanner setelah selesai digunakan
        input.close();

        // Menampilkan titik p2
        System.out.print("(" + x2 + ", " + y2 + ") berada ");
        
        // 2. Logika percabangan untuk menentukan dan mencetak posisi p2
        // Pengecekan dimulai dari kasus yang paling spesifik.
        if (padaSegmenGaris(x0, y0, x1, y1, x2, y2)) {
            System.out.print("pada segmen garis dari (" + x0 + ", " + y0 + ") ke (" + x1 + ", " + y1 + ")");
        } else if (padaGarisYangSama(x0, y0, x1, y1, x2, y2)) {
            System.out.print("pada garis yang sama dari (" + x0 + ", " + y0 + ") ke (" + x1 + ", " + y1 + ")");
        } else if (diKiriGaris(x0, y0, x1, y1, x2, y2)) {
            System.out.print("di sisi kiri garis dari (" + x0 + ", " + y0 + ") ke (" + x1 + ", " + y1 + ")");
        } else {
            // Jika tidak di segmen, tidak di garis sama, dan tidak di kiri, maka pasti di kanan.
            System.out.print("di sisi kanan garis dari (" + x0 + ", " + y0 + ") ke (" + x1 + ", " + y1 + ")");
        }
    }

    /**
     * Method bantu untuk menghitung nilai penentu posisi berdasarkan formula.
     */
    private static double hitungPosisi(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }

    /**
     * Mengembalikan true jika titik (x2, y2) berada di sisi kiri
     * garis dari (x0, y0) ke (x1, y1).
     */
    public static boolean diKiriGaris(double x0, double y0, double x1, double y1, double x2, double y2) {
        return hitungPosisi(x0, y0, x1, y1, x2, y2) > 0;
    }

    /**
     * Mengembalikan true jika titik (x2, y2) berada pada
     * garis lurus yang sama dari (x0, y0) ke (x1, y1).
     */
    public static boolean padaGarisYangSama(double x0, double y0, double x1, double y1, double x2, double y2) {
        return hitungPosisi(x0, y0, x1, y1, x2, y2) == 0;
    }

    /**
     * Mengembalikan true jika titik (x2, y2) berada pada
     * segmen garis dari (x0, y0) ke (x1, y1).
     */
    public static boolean padaSegmenGaris(double x0, double y0, double x1, double y1, double x2, double y2) {
        // Syarat 1: Titik harus berada di garis yang sama.
        boolean diGarisSama = padaGarisYangSama(x0, y0, x1, y1, x2, y2);
        
        // Syarat 2: Koordinat x2 dan y2 harus berada di antara p0 dan p1.
        boolean diAntaraX = (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1));
        boolean diAntaraY = (y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));

        // Kedua syarat harus terpenuhi
        return diGarisSama && diAntaraX && diAntaraY;
    }
}