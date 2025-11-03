import java.util.Scanner;

public class permutasiKombinasi {
    public static long hitungFaktorial (long angka){
        long hasil = 1;
        for(int i = 1;i <= angka;i++){
            hasil *= i;
        }
        return hasil;
    }
    public static long hitungPermutasi (int n, int r){
        long nFaktorial = hitungFaktorial(n);
        long nMinFaktorial = hitungFaktorial(n - r);
        long hasil = nFaktorial / nMinFaktorial;
        return hasil;
    }
    public static long hitungKombinasi(int n,int r){
        long nFaktorial = hitungFaktorial(n);
        long rFaktorial = hitungFaktorial(r);
        long nMinFaktorial = hitungFaktorial(n - r);
        long penyebut = rFaktorial * nMinFaktorial;
        long hasil = nFaktorial / penyebut;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("=====Masukkan pilihan=====");
            System.out.println("1.Menghitung permutasi");
            System.out.println("2.Menghitung kombinasi");
            System.out.println("3.Keluar");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 1:
                System.out.println("Masukkan nilai n : ");
                int n_permutasi = sc.nextInt();
                System.out.println("Masukkan nilai r : ");
                int r_permutasi = sc.nextInt();
                if (n_permutasi < r_permutasi) {
                    System.out.println("Error: Nilai n harus lebih besar atau sama dengan r.");
                } else {long hasilP = hitungPermutasi(n_permutasi,r_permutasi);
                System.out.println("Maka hasil permutasinya adalah : " + hasilP);}
                break;

                case 2:
                System.out.println("Masukkan nilai n : ");
                int n_kombinasi = sc.nextInt();
                System.out.println("Masukkan nilai r : ");
                int r_kombinasi = sc.nextInt();
                if (n_kombinasi < r_kombinasi) {
                    System.out.println("Error: Nilai n harus lebih besar atau sama dengan r.");
                } else {long hasilK = hitungKombinasi(n_kombinasi, r_kombinasi);
                System.out.println("Maka hasil kombinasi adalah : " + hasilK);}
                break;
                case 3:
                System.out.println("pilihan keluar, Terima kasih");
                break;
                default:
                System.out.println("Pilihan tidak ada,jgn ngaco");
            }
        }
        while(pilihan != 3);
        sc.close();
    }
}
