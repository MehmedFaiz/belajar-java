import java.util.Scanner;

public class CekISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Masukkan angka pertama dari ISBN: ");
        String isbn9 = input.next();

       
        if (isbn9.length() != 9) {
            System.out.println("Error. angka harus berjumlah 9 digit");
        } else {
            
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                
                int digit = isbn9.charAt(i) - '0';
                sum += digit * (i + 1);
            }

            
            int checksum = sum % 11;

            
            System.out.print("ISBN-10 Nomornya adalah: " + isbn9);

            if (checksum == 10) {
                System.out.println("X");
            } else {
                System.out.println(checksum);
            }
        }
        
        input.close();
    }
}