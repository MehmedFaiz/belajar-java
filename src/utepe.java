import java.util.Scanner;

public class utepe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka pertama : ");
        int Angkaawal = sc.nextInt();
        System.out.print("masukkan angka kedua : ");
        int Angkakedua = sc.nextInt();
        

        while(Angkaawal <= Angkakedua && Angkaawal <= 1000){
            if(Angkaawal % 2 == 1){
                Angkaawal = Angkaawal * 10;
            }
            else{
                Angkaawal = Angkaawal / 2;
            }
        }
            System.out.print("Kamu berhasil keluar pada langkan ke : " + Angkaawal);
        sc.close();
    }
    
}
