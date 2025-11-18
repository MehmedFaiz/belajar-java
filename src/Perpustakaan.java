// Impor yang dibutuhkan ada di paling atas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * File: Perpustakaan.java
 * Ini adalah file UTAMA yang berisi SEMUA kelas yang dibutuhkan.
 * Kelas "Perpustakaan" adalah kelas public yang berisi method main().
 * Kelas Penulis, Kategori, dan Buku ada di bawahnya tanpa "public".
 */
public class Perpustakaan {

    // Ini adalah method utama yang akan dijalankan
    public static void main(String[] args) {

        // --- LANGKAH 1: Buat Kategori ---
        Kategori katTeknologi = new Kategori("Teknologi");
        Kategori katFilsafat = new Kategori("Filsafat");
        Kategori katSejarah = new Kategori("Sejarah");
        Kategori katAgama = new Kategori("Agama");
        Kategori katPsikologi = new Kategori("Psikologi");
        Kategori katPolitik = new Kategori("Politik");
        Kategori katFiksi = new Kategori("Fiksi");
        
        List<Kategori> daftarKategori = Arrays.asList(
            katTeknologi, katFilsafat, katSejarah, katAgama, katPsikologi, katPolitik, katFiksi
        );

        // --- LANGKAH 2: Buat Penulis ---
        Penulis p1 = new Penulis("Yuval Noah Harari");
        Penulis p2 = new Penulis("J.K. Rowling");
        Penulis p3 = new Penulis("Andrea Hirata");
        Penulis p4 = new Penulis("Tere Liye");
        Penulis p5 = new Penulis("George Orwell");
        Penulis p6 = new Penulis("Sigmund Freud");
        Penulis p7 = new Penulis("Plato");
        Penulis p8 = new Penulis("Jared Diamond");
        Penulis p9 = new Penulis("Dee Lestari");
        Penulis p10 = new Penulis("Eka Kurniawan");
        Penulis p11 = new Penulis("Erich Fromm");

        // --- LANGKAH 3: Buat Database Buku ---
        List<Buku> daftarBuku = new ArrayList<>();

        // 5 Buku Teknologi
        daftarBuku.add(new Buku("Sapiens: A Brief History of Humankind", katTeknologi, Arrays.asList(p1)));
        daftarBuku.add(new Buku("Homo Deus: A Brief History of Tomorrow", katTeknologi, Arrays.asList(p1)));
        daftarBuku.add(new Buku("Guns, Germs, and Steel", katTeknologi, Arrays.asList(p8)));
        daftarBuku.add(new Buku("The Innovators", katTeknologi, Arrays.asList(new Penulis("Walter Isaacson"))));
        daftarBuku.add(new Buku("Clean Code", katTeknologi, Arrays.asList(new Penulis("Robert C. Martin"))));

        // 5 Buku Filsafat
        daftarBuku.add(new Buku("Republic", katFilsafat, Arrays.asList(p7)));
        daftarBuku.add(new Buku("The Art of Loving", katFilsafat, Arrays.asList(p11)));
        daftarBuku.add(new Buku("Beyond Good and Evil", katFilsafat, Arrays.asList(new Penulis("Friedrich Nietzsche"))));
        daftarBuku.add(new Buku("Meditations", katFilsafat, Arrays.asList(new Penulis("Marcus Aurelius"))));
        daftarBuku.add(new Buku("Sophie's World", katFilsafat, Arrays.asList(new Penulis("Jostein Gaarder"))));

        // 5 Buku Sejarah
        daftarBuku.add(new Buku("A People's History of the United States", katSejarah, Arrays.asList(new Penulis("Howard Zinn"))));
        daftarBuku.add(new Buku("Sejarah Dunia yang Disembunyikan", katSejarah, Arrays.asList(new Penulis("Jonathan Black"))));
        daftarBuku.add(new Buku("Collapse: How Societies Choose to Fail or Succeed", katSejarah, Arrays.asList(p8)));
        daftarBuku.add(new Buku("The Second World War", katSejarah, Arrays.asList(new Penulis("Antony Beevor"))));
        daftarBuku.add(new Buku("1491: New Revelations of the Americas Before Columbus", katSejarah, Arrays.asList(new Penulis("Charles C. Mann"))));

        // 5 Buku Agama
        daftarBuku.add(new Buku("Tafsir Al-Mishbah", katAgama, Arrays.asList(new Penulis("Quraish Shihab"))));
        daftarBuku.add(new Buku("The Case for Christ", katAgama, Arrays.asList(new Penulis("Lee Strobel"))));
        daftarBuku.add(new Buku("Mere Christianity", katAgama, Arrays.asList(new Penulis("C.S. Lewis"))));
        daftarBuku.add(new Buku("Bhagavad Gita: As It Is", katAgama, Arrays.asList(new Penulis("A.C. Bhaktivedanta Swami"))));
        daftarBuku.add(new Buku("The God Delusion", katAgama, Arrays.asList(new Penulis("Richard Dawkins"))));

        // 5 Buku Psikologi
        daftarBuku.add(new Buku("The Interpretation of Dreams", katPsikologi, Arrays.asList(p6)));
        daftarBuku.add(new Buku("Man's Search for Meaning", katPsikologi, Arrays.asList(new Penulis("Viktor Frankl"))));
        daftarBuku.add(new Buku("Thinking, Fast and Slow", katPsikologi, Arrays.asList(new Penulis("Daniel Kahneman"))));
        daftarBuku.add(new Buku("Atomic Habits", katPsikologi, Arrays.asList(new Penulis("James Clear"))));
        daftarBuku.add(new Buku("Filosofi Teras", katPsikologi, Arrays.asList(new Penulis("Henry Manampiring"))));

        // 5 Buku Politik
        daftarBuku.add(new Buku("1984", katPolitik, Arrays.asList(p5)));
        daftarBuku.add(new Buku("Animal Farm", katPolitik, Arrays.asList(p5)));
        daftarBuku.add(new Buku("The Prince", katPolitik, Arrays.asList(new Penulis("Niccolò Machiavelli"))));
        daftarBuku.add(new Buku("Das Kapital", katPolitik, Arrays.asList(new Penulis("Karl Marx"))));
        daftarBuku.add(new Buku("Why Nations Fail", katPolitik, Arrays.asList(new Penulis("Daron Acemoglu"), new Penulis("James A. Robinson"))));

        // 5 Buku Fiksi
        daftarBuku.add(new Buku("Harry Potter and the Philosopher's Stone", katFiksi, Arrays.asList(p2)));
        daftarBuku.add(new Buku("Laskar Pelangi", katFiksi, Arrays.asList(p3)));
        daftarBuku.add(new Buku("Bumi", katFiksi, Arrays.asList(p4)));
        daftarBuku.add(new Buku("Aroma Karsa", katFiksi, Arrays.asList(p9)));
        daftarBuku.add(new Buku("Cantik Itu Luka", katFiksi, Arrays.asList(p10)));

        // --- LANGKAH 4: Tampilkan Semua Buku per Kategori ---
        System.out.println("========= DATABASE PERPUSTAKAAN KAMPUS X =========");
        System.out.println("\nTotal Buku dalam sistem: " + daftarBuku.size() + "\n");

        for (Kategori kat : daftarKategori) {
            System.out.println("-----------------------------------------------------");
            System.out.println("KATEGORI : " + kat.toString().toUpperCase());
            System.out.println("-----------------------------------------------------");
            
            int nomorBuku = 1;
            
            for (Buku buku : daftarBuku) {
                if (buku.getKategori() == kat) {
                    System.out.println("Buku ke-" + nomorBuku + ":");
                    System.out.println(buku); 
                    System.out.println();
                    nomorBuku++;
                }
            }
        }
    }
}

// ===================================================================
// KELAS-KELAS ENTITAS (Tanpa 'public')
// Kelas-kelas ini ada di file yang sama tapi di luar kelas Perpustakaan
// ===================================================================

/**
 * Merepresentasikan entitas seorang Penulis.
 * (Tidak ada 'public' agar bisa digabung dalam satu file)
 */
class Penulis {
    private String namaPenulis;

    public Penulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    @Override
    public String toString() {
        return this.namaPenulis;
    }
}

/**
 * Merepresentasikan entitas sebuah Kategori Buku.
 * (Tidak ada 'public' agar bisa digabung dalam satu file)
 */
class Kategori {
    private String namaKategori;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    @Override
    public String toString() {
        return this.namaKategori;
    }
}

/**
 * Merepresentasikan entitas sebuah Buku.
 * (Tidak ada 'public' agar bisa digabung dalam satu file)
 */
class Buku {
    private String judul;
    private Kategori kategori;
    private List<Penulis> daftarPenulis;

    public Buku(String judul, Kategori kategori, List<Penulis> daftarPenulis) {
        this.judul = judul;
        this.kategori = kategori;
        this.daftarPenulis = daftarPenulis;
    }

    // Getter untuk mendapatkan Kategori
    public Kategori getKategori() {
        return this.kategori;
    }

    @Override
    public String toString() {
        return "Judul    : " + this.judul + "\n" +
               "Kategori : " + this.kategori + "\n" +
               "Penulis  : " + this.daftarPenulis;
    }
}