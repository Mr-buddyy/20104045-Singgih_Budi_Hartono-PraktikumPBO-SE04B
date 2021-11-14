package modul_5.Praktikum.Sekolah.Mahasiswa;

public class Mahasiswa {
    private int nrp;
    private String nama;

    //overloading vonstructor
    public Mahasiswa(){

    }

    public Mahasiswa(int nrp){
        this.nrp = nrp;
    }

    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }
    public int getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}
