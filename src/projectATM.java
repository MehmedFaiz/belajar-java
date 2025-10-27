import java.util.Scanner;

public class projectATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankaccount myAccount = new bankaccount(1000000);
        int pilihan;

        do{
            System.out.println("\n======== Aplikasi ATM ========");
            System.out.println("1.Cek saldo");
            System.out.println("2.Tarik saldo");
            System.out.println("3.Setor saldo");
            System.out.println("4.Keluar");
            System.out.print("masukkan Pilihan 1-4 : ");
            pilihan = sc.nextInt();

            switch(pilihan){
                case 1:
                System.out.printf("saldo anda : Rp%,.2f\n", myAccount.getSaldo());
                break;
                case 2:
                System.out.print("Masukkan jumlah uang yang ingin ditarik : ");
                double tarik = sc.nextDouble();
                 myAccount.withdraw(tarik);
                break;
                case 3:
                System.out.print("masukkan jumlah uang yang ingin disetor : ");
                double setor = sc.nextDouble();
                myAccount.deposit(setor);
                break;
                case 4:
                System.out.println("Terima kasih telah menggunakan Program ini");
                sc.close();
                return;
                
                default:
                System.out.println("pilihan tidak valid");

            }
        }
        while(pilihan != 4);
    }
}
