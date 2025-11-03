    import java.util.Scanner;
    import java.util.Locale;   

public class project22 {
 
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        //memberika input berat badan
        System.out.println("masukkan berat badan (kg)  ");
        double berat = scanner.nextDouble();    
        //memberikan input tinggi badan
        System.out.println("masukkan tinggi badan (m)  "); 
        double tinggi = scanner.nextDouble(); 
        //memasukkan rumus BMI
        System.out.printf("BMI anda adalah %.2f\n", (berat/(tinggi*tinggi)));
        if ((berat/(tinggi*tinggi))<18.5){
            //menentukan berat kurang
            System.out.println("Berat badan anda kurang");
        }
        //menentukan berat ideal
        else if ((berat/(tinggi*tinggi))>=18.5 && (berat/(tinggi*tinggi))<=25){
            System.out.println("Berat badan anda ideal");
        }    
        //menentukan berat berlebih
        else if ((berat/(tinggi*tinggi))>25 && (berat/(tinggi*tinggi))<=30){
            System.out.println("Berat badan anda berlebih");
        }
        //menentukan obesitas
        else {
            System.out.println("Anda obesitas");
        }
        //menutup scanner
        scanner.close();
    }

    
}
