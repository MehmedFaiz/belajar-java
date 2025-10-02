import java.util.Locale;
import java.util.Scanner; 
    
public class project1 {
    public static void main(String[] args) {
        //Instansiasi objek Scanner dan disimpan ke variabel scan
        Scanner scanner = new Scanner(System.in);

        //menyesuaikan font us agar bisa menggunakan titik
        scanner.useLocale(Locale.US);

        //menampilkan judul
        System.out.println("== DATA MAHASISWA ==");
        //menginput data dari user

        System.out.println("Masukkan Nama,NIM,Angkatan,Prodi,Mahasiswa aktif(true/false),IPK");

        //menyimpan nama kedalam variable
        String nama = scanner.nextLine();

        //menyimpan NIM kedalam Variable
        String NIM = scanner.nextLine();

        //menyimpan Angkatan kedalam variable
        int Angkatan = scanner.nextInt();

        //mengubah dari integer ke string
        scanner.nextLine();
        //menyimpan prodi kedalam variable
        String Prodi = scanner.nextLine();

        //menyimpan Status Mahasiswa kedalam variable
        Boolean Status = scanner.nextBoolean();

        //mengubah dari boolean ke string
        scanner.nextLine();

        //menyimpan IPK kedalam Variable
        Double IPK = scanner.nextDouble();

        //mengubah dari double ke string
        scanner.nextLine();
        
        //membuat format 2 angka dibelakang koma
        String ipkFormatted = String.format(Locale.US,"%.2f", IPK);

        //menampilkan output data 
        System.out.println("== DATA MAHASISWA ==");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Angkatan :" + Angkatan);
        System.out.println("Prodi :" + Prodi);
        System.out.println("Mahasiswa Aktif :" + Status);
        System.out.println("IPK : " + ipkFormatted);
        
        //menutup objek scanner
        scanner.close();

        }
    }
