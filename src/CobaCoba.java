import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CobaCoba {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        int umur = sc.nextInt();
        String kategori;
        if(umur < 13){
            kategori = "Anak-anak";
        }
        else if(umur >= 13){
            kategori = "Remaja";
        }
        else if(umur >= 20 && umur < 60){
            kategori = "Dewasa";
        }
        else if(umur >= 60 && umur <= 120){
            kategori = "lansia";
        }
        else{
            kategori = "error";
        }
        System.out.print("Halo " + nama + ", Anda termasuk kategori" + kategori);
    }
}