import java.util.Scanner;

public class laprakPrime {
    public static boolean isPrime(int num) {
        
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
        
            if (num % i == 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka prima : ");
        int angkaInput = sc.nextInt();

        if(isPrime(angkaInput)){
            System.out.println(angkaInput + " Adalah bilangan prima");
            
        }else{
            System.out.println(angkaInput + " Bukan bilangan prima");
        }
        System.out.println("\n--- Bilangan Prima 1-100 ---");
        for(int i = 1;i<=100;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    
}
