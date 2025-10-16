import java.util.Scanner;

public class kartu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] kartu = new int[52];
        int index = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                kartu[index++] = i;
            }
        }
        int jumlahkombinasi = 0;
        for(int i = 0; i < 52; i++){
            for(int j = i + 1; j < 52; j++){
                for(int k = j + 1; k < 52; k++){
                    for(int l = k + 1; l < 52; l++){
                        if(kartu[i] + kartu[j] + kartu[k] + kartu[l] == 24){
                            jumlahkombinasi++;
                        }
                    }
                }
            }
        }
        System.out.println(jumlahkombinasi);
        sc.close();

    }
}
    

