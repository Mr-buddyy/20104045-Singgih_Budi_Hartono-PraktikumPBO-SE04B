package modul_5.Praktikum.Sekolah.Kelas;

import modul_5.Praktikum.Sekolah.Mahasiswa.Mahasiswa;

public class kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa[] mahasiswa = new Mahasiswa[10];
    private int mahasiswalegth;

    public kelas(int kodekelas, String namakelas) {
        this.kodekelas = kodekelas;
        this.namakelas = namakelas;
        this.mahasiswalegth = -1;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        mahasiswalegth++;
        this.mahasiswa[mahasiswalegth] = mahasiswa;
    }

    public String getNamakelas() {
        return namakelas;
    }

    public Mahasiswa[] getMahasiswa() {
        Mahasiswa[] mhsreturn = new Mahasiswa[mahasiswalegth + 1];
        for (int x = 0; x <= mahasiswalegth; x++) {
            mhsreturn[x] = mahasiswa[x];
        }
        return mhsreturn;
    }
}
