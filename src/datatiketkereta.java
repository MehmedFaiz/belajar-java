import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class datatiketkereta {
    public static void main(String[] args) {
        String[][] tiket = {{"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
                        {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
                        {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
                        {"Pariwisata", "300000", "10", "Ada", "Ada"}
                    };
        Scanner sc = new Scanner(System.in);
        int pilihan = -1;

        // Tempat untuk menyimpan pesanan yang masuk
        List<String[]> daftarPesanan = new ArrayList<>();

        // Loop utama agar program terus berjalan
        while (true) {
            System.out.println("\n==============================================");
            System.out.println("      Pemesanan Tiket Kereta Api");
            System.out.println("==============================================");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.println("==============================================");

            try {
                System.out.print("Masukkan nilai: ");
                pilihan = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Input harus berupa angka!");
                sc.next(); // Membersihkan input yang salah
                continue; // Kembali ke awal loop
            }

            // Logika untuk setiap pilihan menu
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Semua Kereta Api ---");
                    for (String[] kereta : tiket) {
                        System.out.printf("Jenis: %-12s | Harga: Rp%-8s | Diskon: %s%%\n", kereta[0], kereta[1], kereta[2]);
                    }
                    break;
                
                case 2:
                    System.out.println("\n--- Daftar Kereta Api dengan AC ---");
                    for (String[] kereta : tiket) {
                        if (kereta[3].equals("Ada")) {
                            System.out.printf("Jenis: %-12s | Harga: Rp%-8s | AC: %s\n", kereta[0], kereta[1], kereta[3]);
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("\n--- Daftar Kereta Api dengan Colokan ---");
                    for (String[] kereta : tiket) {
                        if (kereta[4].equals("Ada")) {
                            System.out.printf("Jenis: %-12s | Harga: Rp%-8s | Colokan: %s\n", kereta[0], kereta[1], kereta[4]);
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("\n--- Form Pemesanan Tiket ---");
                    sc.nextLine(); // Membersihkan buffer setelah nextInt()
                    System.out.print("Masukkan nama Anda: ");
                    String namaPemesan = sc.nextLine();

                    System.out.println("\nSilakan pilih jenis kereta:");
                    for (int i = 0; i < tiket.length; i++) {
                        System.out.printf("%d. %s\n", i + 1, tiket[i][0]);
                    }
                    
                    System.out.print("Pilih nomor kereta: ");
                    int pilihanKeretaIdx = sc.nextInt() - 1;

                    if (pilihanKeretaIdx >= 0 && pilihanKeretaIdx < tiket.length) {
                        String[] keretaDipesan = tiket[pilihanKeretaIdx];
                        
                        // Konversi String ke Angka untuk perhitungan
                        int harga = Integer.parseInt(keretaDipesan[1]);
                        double diskon = Double.parseDouble(keretaDipesan[2]);
                        
                        // Hitung harga akhir
                        int hargaBayar = (int) (harga - (harga * (diskon / 100.0)));
                        
                        // Simpan pesanan
                        String[] pesananBaru = {namaPemesan, keretaDipesan[0], String.valueOf(hargaBayar)};
                        daftarPesanan.add(pesananBaru);
                        
                        System.out.println("\n✔ Pemesanan Berhasil!");
                        System.out.printf("Detail: %s - Tiket %s - Harga Rp%d\n", namaPemesan, keretaDipesan[0], hargaBayar);
                    } else {
                        System.out.println("[ERROR] Pilihan kereta tidak valid.");
                    }
                    break;
                
                case 5:
                    System.out.println("\n--- Daftar Tiket yang Telah Dipesan ---");
                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada tiket yang dipesan.");
                    } else {
                        for (int i = 0; i < daftarPesanan.size(); i++) {
                            String[] pesanan = daftarPesanan.get(i);
                            System.out.printf("%d. Nama: %-15s | Kereta: %-12s | Bayar: Rp%s\n", 
                                              i + 1, pesanan[0], pesanan[1], pesanan[2]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nTerima kasih! Sampai jumpa. 👋");
                    sc.close();
                    return; // Keluar dari program
                
                default:
                    System.out.println("\n[ERROR] Pilihan tidak valid. Silakan masukkan angka dari 0-5.");
                    break;
            }
        }
    }
}
