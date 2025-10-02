import java.util.Scanner;
import java.util.Locale;

public class latihansoal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int evenNumber = 2;

        while (count < n) {
    sum = sum + evenNumber; // Tambahkan bilangan genap ke total
    evenNumber = evenNumber + 2; // Lanjut ke bilangan genap berikutnya
    count = count + 1; // Tambah hitungan karena sudah menemukan satu
}
        System.out.println("hasilnya adalah:" + sum);
        scanner.close();
        
    }

    
}
