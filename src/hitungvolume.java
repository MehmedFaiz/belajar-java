import java.util.Scanner;

public class hitungvolume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        do{
            System.out.println("\nMenu:");
            System.out.println("0. Keluar");
            System.out.println("1. Hitung Volume Balok");
            System.out.println("2. Hitung Volume Bola");
            System.out.println("3. Hitung Volume Kerucut");
            System.out.println("4. Hitung Volume Silinder");
            System.out.println("5. Hitung Volume Limas segitiga");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();
            switch(pilihan){
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                case 1:
                    System.out.print("Masukkan panjang balok: ");
                    double panjang = sc.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebar = sc.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggi = sc.nextDouble();
                    double volumeBalok = panjang * lebar * tinggi;
                    System.out.println("Volume Balok: " + volumeBalok);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = sc.nextDouble();
                    double volumeBola = (4.0/3.0) * Math.PI * Math.pow(jariJariBola, 3);
                    System.out.println("Volume Bola: " + volumeBola);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari alas kerucut: ");
                    double jariJariKerucut = sc.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = sc.nextDouble();
                    double volumeKerucut = (1.0/3.0) * Math.PI * Math.pow(jariJariKerucut, 2) * tinggiKerucut;
                    System.out.println("Volume Kerucut: " + volumeKerucut);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari alas silinder: ");
                    double jariJariSilinder = sc.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggiSilinder = sc.nextDouble();
                    double volumeSilinder = Math.PI * Math.pow(jariJariSilinder, 2) * tinggiSilinder;
                    System.out.println("Volume Silinder: " + volumeSilinder);
                    break;
                case 5:
                    System.out.print("Masukkan alas segitiga limas: ");
                    double alasSegitiga = sc.nextDouble();
                    System.out.print("Masukkan tinggi segitiga limas: ");
                    double tinggiSegitiga = sc.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tinggiLimas = sc.nextDouble();
                    double volumeLimas = (1.0/3.0) * (0.5 * alasSegitiga * tinggiSegitiga) * tinggiLimas;
                    System.out.println("Volume Limas Segitiga: " + volumeLimas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }while(pilihan != 0);
        sc.close();
    
    }
}
