import java.util.Scanner;
public class AplikasiATM {
    public static void main(String[] args) {
        
        int saldo = 1000000;
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        do{
            System.out.println("=== ATM SEDERHANA ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("masukkan pilihan anda : ");
            pilihan = sc.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("Saldo anda saat ini : " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah uang yang ingin ditarik : ");
                    int tarik = sc.nextInt();
                    if(tarik > saldo){
                        System.out.println("Saldo anda tidak mencukupi");
                    }else{
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil. Saldo anda saat ini : " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah uang yang ingin disetor : ");
                    int setor = sc.nextInt();
                    saldo += setor;
                    System.out.println("Setoran berhasil. Saldo anda saat ini : " + saldo);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }while(pilihan != 4);
        sc.close();
        
        
        

    }
}


