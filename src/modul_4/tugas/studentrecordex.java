package modul_4.tugas;

public class studentrecordex {
    public static void main(String[] args) {
        Student_Record wahyu = new Student_Record();
        Student_Record ini = new Student_Record();
        Student_Record nama = new Student_Record();

        wahyu.setName("wahyu");
        ini.setName("ini");
        nama.setName("nama");

        System.out.println(wahyu.getName());
        System.out.println("Hitung = " + Student_Record.getStudentSount());
    }
}
