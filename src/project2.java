import java.util.Scanner;
import java.util.Locale;

public class project2 {
   
    public static void main (String[] args){
        //memanggil scanner
        Scanner scanner = new Scanner(System.in);
        //menggunakan sistem tulisan us
        scanner.useLocale(Locale.US);
        //memberikan opsi input panjang 
        System.out.println("masukkan panjang persegi panjang");
        double panjang = scanner.nextDouble();
        //memberikan opsi input lebar
        System.out.println("masukkan lebar persegi panjang");
        double lebar = scanner.nextDouble();
        //rumus luas persegi panjang
        System.out.printf("luasnya adalah %.2f\n",(panjang*lebar));
        //rumus keliling persegi panjang
        System.out.printf("kelilingnya adalah %.2f\n", 2*(panjang+lebar));
      
        //memberikan opsi input jari-jari lingkaran
        System.out.println("\nmasukkan jari-jari lingkaran  ");
        double jari = scanner.nextDouble(); 
        //rumus luas lingkaran
        System.out.printf("luasnya adalah %.2f\n", (3.14*jari*jari));    
        //rumus keliling lingkaran
        System.out.printf("kelilingnya adalah %.2f\n", (2*3.14*jari));
        //memberikan opsi input tinggi segitiga
        System.out.println("\nmasukkan tinggi segitiga ");
        double tinggi = scanner.nextDouble();   
        //memberikan opsi input alas segitiga
        System.out.println("masukkan alas segitiga ");  
        double alas = scanner.nextDouble(); 
        //rumus luas segitiga
        System.out.printf("luasnya adalah %.2f\n", (0.5*alas*tinggi));   
        //rumus keliling segitiga
        System.out.printf("kelilingnya adalah %.2f\n", (3*alas));    
        //menutup scanner
        scanner.close();









    }
}
