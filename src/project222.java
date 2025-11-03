import java.util.Scanner;
import java.util.Locale;

public class project222 {
    public static void main(String[] args) {
        //memanggil scanner
        Scanner scanner = new Scanner(System.in);
        // mengubah koma ke titik
        scanner.useLocale(Locale.US);
        // memasukan variabel
        final int upah_jam_lembur = 6000;
        final int upah_jam_kerja = 5000;
        final int denda_jam = 1000;
        final int batas_maks_kerja = 60;
        final int batas_min_kerja = 50;
        // menentukan tipe variabel
        int jamkerja;
        int upah = 0;
        int lembur = 0;
        int denda = 0;
        int total;
        //input jam kerja
        System.out.println("jam kerja : ");
        jamkerja = scanner.nextInt();
        //menutup scanner
        scanner.close();
        //if untuk jam kerja > batas maksimal jam
        if (jamkerja > batas_maks_kerja){
            //mendapatkan upah yang dikali jam kerja
            upah =batas_maks_kerja * upah_jam_kerja;
            //membuat variabel jam lembur
            int jamlembur = jamkerja - batas_maks_kerja;
            //mendapatkan bonus per jam lembur
            lembur = jamlembur * upah_jam_lembur;
            //jika jam kerja < batas minimal jam
        }else if (jamkerja < batas_min_kerja){
            //mendapatkan upah yang dikali jam kerja
            upah = jamkerja * upah_jam_kerja;
            //membuat variabel jam kurang
            int jamkurang = batas_min_kerja - jamkerja;
            //mendapatkan denda yang dikali denda/jam
            denda = jamkurang * denda_jam;
        }
        //jika jam kerja pas atau tidak lebih dan tidak kurang
        else{
            upah = jamkerja * upah_jam_kerja;
        }
        total = upah + lembur - denda;
        //mengoutput jam kerja dan menentukan lebih,kurang atau pas
        System.out.println("upah    = Rp." + upah);
        System.out.println("Lembur  = Rp." + lembur);
        System.out.println("Denda   = Rp." + denda);
        System.out.println("-------------");
        System.out.println("total   = Rp." + total);
        

    }
}
