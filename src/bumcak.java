import java.util.Scanner;

public class bumcak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan real :");
        String hasil = "";
        int N = input.nextInt();
        if(N % 2 == 0){
            hasil += "Bum";
        }
        if(N % 3 == 0){
            hasil += "Cak";
        }
        if(N % 5 == 0){
            hasil += "Ces";
        }
        if(N % 7 == 0){
            hasil += "Pak";
        }
        if(N % 11 == 0){
            hasil += "Dum";
        }
        input.close();

    }
}
