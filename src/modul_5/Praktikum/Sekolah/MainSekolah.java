package modul_5.Praktikum.Sekolah;

import modul_5.Praktikum.Sekolah.Kelas.kelas;
import modul_5.Praktikum.Sekolah.Mahasiswa.Mahasiswa;

public class MainSekolah {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa(1002, "Ei");
        Mahasiswa mahasiswa2 = new Mahasiswa(1003, "Yuzong");
        Mahasiswa mahasiswa3 = new Mahasiswa(1004, "Lapu");
        Mahasiswa mahasiswa4 = new Mahasiswa(1005, "yeye");

        kelas kelasElec = new kelas(100, "Electro");

        kelasElec.setMahasiswa(mahasiswa1);
        kelasElec.setMahasiswa(mahasiswa2);
        kelasElec.setMahasiswa(mahasiswa3);

        for (Mahasiswa mahasiswaX : kelasElec.getMahasiswa()) {
            System.out.println(mahasiswaX.getNama());
        }

        System.out.println();

        kelasElec.setMahasiswa(mahasiswa4);
        for (Mahasiswa mahasiswaX : kelasElec.getMahasiswa()) {
            System.out.println(mahasiswaX.getNama());
        }
    }
}
