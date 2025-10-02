import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        ArrayList<Integer> dataangka = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        do{
            System.out.println("1. input data");
            System.out.println("2. lihat data");
            System.out.println("3. average");
            System.out.println("4. sum");
            System.out.println("5. max");
            System.out.println("6. min");
            System.out.println("7. keluar");
            System.out.print("masukkan pilihan : ");
            pilihan = sc.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("masukkan data angka : ");
                    int angka = sc.nextInt();
                    dataangka.add(angka);
                    break;
                case 2:
                    System.out.println("data angka : " + dataangka);
                    break;
                case 3:
                    if(dataangka.size() == 0){
                        System.out.println("data kosong");
                    } else {
                        int sum = 0;
                        for(int num : dataangka){
                            sum += num;
                        }
                        double average = (double) sum / dataangka.size();
                        System.out.println("average : " + average);
                    }
                    break;
                case 4:
                    if(dataangka.size() == 0){
                        System.out.println("data kosong");
                    } else {
                        int sum = 0;
                        for(int num : dataangka){
                            sum += num;
                        }
                        System.out.println("sum : " + sum);
                    }
                    break;
                case 5:
                    if(dataangka.size() == 0){
                        System.out.println("data kosong");
                    } else {
                        int max = dataangka.get(0);
                        for(int num : dataangka){
                            if(num > max){
                                max = num;
                            }
                        }
                        System.out.println("max : " + max);
                    }
                    break;
                case 6:
                    if(dataangka.size() == 0){
                        System.out.println("data kosong");
                    } else {
                        int min = dataangka.get(0);
                        for(int num : dataangka){
                            if(num < min){
                                min = num;
                            }
                        }
                        System.out.println("min : " + min);
                    }
                    break;
                case 7:
                    System.out.println("keluar dari program");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while(pilihan != 7);
        sc.close();
        }
    }

