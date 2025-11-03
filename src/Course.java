// Ini adalah KODE AWAL (Listing 10.6)
// yang akan kita MODIFIKASI
public class Course {
    private String courseName;
    private String[] students = new String[10]; // Kita mulai dgn ukuran kecil dulu, misal 10
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Method yang akan KITA REVISI
    public void addStudent(String student) {
        // Saat ini, kodenya mungkin langsung menambah student
        // TANPA mengecek apakah array-nya penuh
        if(numberOfStudents == student.length()){
            String[] arrayBaru = new String [students.length * 2];
            for(int i = 0; i < numberOfStudents;i++){
                arrayBaru[i] = students[i];
            }
            students = arrayBaru;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Method getter
    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String Student){
        int indexDitemukan = -1;
        for(int i = 0; i < numberOfStudents;i++){
            if(Student.equals(students[i])){
                indexDitemukan = i;
                break;
            }
        }
        if(indexDitemukan != -1){
            for(int i = indexDitemukan;i < numberOfStudents - 1;i++){
                students[i] = students[i+1];
            }
            numberOfStudents -= 1;
        }
    }
    public void clear() {
        // Cara termudah adalah mereset jumlahnya ke 0.
        // Data lama akan tertimpa saat addStudent() dipanggil lagi.
        numberOfStudents = 0;
        
        // Opsional: Jika ingin membersihkan memori, bisa juga reset array-nya
        // students = new String[DEFAULT_CAPACITY];
    }
    // --- Getters (Method Bawaan) ---
    // --- NANTI KAMU AKAN MENAMBAH METHOD BARU DI SINI ---
    // public void dropStudent(String student) { ... }
    // public void clear() { ... }
}
