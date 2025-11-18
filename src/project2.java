import java.util.Scanner;
import java.util.Locale;

public class project2 {
   
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("masukkan panjang persegi panjang");
        double panjang = scanner.nextDouble();
        System.out.println("masukkan lebar persegi panjang");
        double lebar = scanner.nextDouble();
        System.out.printf("luasnya adalah %.2f\n",(panjang*lebar));
        System.out.printf("kelilingnya adalah %.2f\n", 2*(panjang+lebar));
      
        System.out.println("\nmasukkan jari-jari lingkaran  ");
        double jari = scanner.nextDouble(); 
        System.out.printf("luasnya adalah %.2f\n", (3.14*jari*jari));    
        System.out.printf("kelilingnya adalah %.2f\n", (2*3.14*jari));
        
        System.out.println("\nmasukkan tinggi segitiga ");
        double tinggi = scanner.nextDouble();   
        System.out.println("masukkan alas segitiga ");  
        double alas = scanner.nextDouble(); 
        System.out.printf("luasnya adalah %.2f\n", (0.5*alas*tinggi));   
        System.out.printf("kelilingnya adalah %.2f\n", (3*alas));    
        scanner.close();    









    }
}
