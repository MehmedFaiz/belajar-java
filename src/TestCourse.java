public class TestCourse {
    public static void main(String[] args) {
        
        // 1. Buat sebuah course
        Course matkulJava = new Course("Pemrograman Berorientasi Objek");

        // 2. Tambah tiga students
        System.out.println("Menambah 3 mahasiswa...");
        matkulJava.addStudent("Andi");
        matkulJava.addStudent("Budi");
        matkulJava.addStudent("Cica");

        System.out.println("Total mahasiswa: " + matkulJava.getNumberOfStudents());
        tampilkanMahasiswa(matkulJava); // Panggil method helper di bawah
        
        System.out.println("---");

        // 3. Hapus satu student (misal: "Budi")
        System.out.println("Menghapus 'Budi'...");
        matkulJava.dropStudent("Budi");

        // 4. Tampilkan students yang tersisa
        System.out.println("Total mahasiswa sekarang: " + matkulJava.getNumberOfStudents());
        tampilkanMahasiswa(matkulJava);
        
        System.out.println("---");
        
        // Bonus: Tes method clear()
        System.out.println("Membersihkan course...");
        matkulJava.clear();
        System.out.println("Total mahasiswa setelah di-clear: " + matkulJava.getNumberOfStudents());
        tampilkanMahasiswa(matkulJava);
    }

    /**
     * Method helper untuk menampilkan mahasiswa di console
     */
    public static void tampilkanMahasiswa(Course course) {
        System.out.println("Daftar mahasiswa di " + course.getCourseName() + ":");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("- " + students[i]);
        }
        
        // Jika tidak ada mahasiswa
        if (course.getNumberOfStudents() == 0) {
            System.out.println("(Tidak ada mahasiswa)");
        }
    }

    
}
