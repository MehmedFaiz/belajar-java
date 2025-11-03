import java.util.*;

public class utp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int baris = input.nextInt();
        int kolom = input.nextInt();
        boolean[][] kursi = new boolean[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                kursi[i][j] = input.nextBoolean();
            }
        }
        
        int jumlahPerintah = input.nextInt();
        input.nextLine();
        
        int hargaKursi = -1;
        
        for (int k = 0; k < jumlahPerintah; k++) {
            String perintah = input.nextLine().trim();
            String[] bagian = perintah.split(" ");
            String cmd = bagian[0];
            
            switch (cmd) {
            case "CEK_KURSI":
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        System.out.print((kursi[i][j] ? "X" : "O") + (j == kolom -1 ? "" : " "));
                    }
                    System.out.println();
                }
                break;
            
            case "SETHARGA":
                int hargaBaru = Integer.parseInt(bagian[1]);
                hargaKursi = hargaBaru;
                System.out.println("Harga kursi diubah menjadi " + hargaBaru + ".");
                break;
            
            case "PESAN":
                int r = Integer.parseInt(bagian[1]) - 1;
                int c = Integer.parseInt(bagian[2]) - 1;
                
                if (!kursi[r][c]) {
                    kursi[r][c] = true;
                    System.out.println("Kursi baris " + (r + 1) + " kolom " + (c + 1) + " berhasil dipesan.");
                } else {
                    System.out.println("Kursi baris " + (r + 1) + " kolom " + (c + 1) + " sudah dipesan sebelumnya!");
                }
                break;
                
            case "HITUNG_PENDAPATAN":
                if (hargaKursi == -1) {
                    System.out.println("Harga kursi belum ditetapkan!");
                } else {
                    int totalDipesan = 0;
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            if (kursi[i][j]) totalDipesan++;
                        }
                    }
                    int pendapatan = totalDipesan * hargaKursi;
                    System.out.println("Pendapatan: " + pendapatan);
                }
                break;
                
            case "KOSONGKAN":
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        kursi[i][j] = false;
                    }
                }
                System.out.println("Semua kursi telah dikosongkan.");
                break;
            
            default:
                System.out.println("Perintah tidak dikenali: " + cmd);
            }
        }input.close();
    }
}