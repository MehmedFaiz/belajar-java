import java.util.Scanner;

public class HitungKelilingSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan sisi pertama: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi kedua: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi ketiga: ");
        double sisi3 = input.nextDouble();

       
        if ((sisi1 + sisi2 > sisi3) && (sisi1 + sisi3 > sisi2) && (sisi2 + sisi3 > sisi1)) {
            
            double keliling = sisi1 + sisi2 + sisi3;
            System.out.println("Input valid.");
            System.out.println("Keliling segitiga adalah: " + keliling);
        } else {
            
            System.out.println("Input tidak valid.");
            System.out.println("Aturan segitiga tidak terpenuhi.");
        }

        input.close();
    }
}
