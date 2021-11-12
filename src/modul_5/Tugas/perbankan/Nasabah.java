package modul_5.Tugas.perbankan;

public class Nasabah {
    private String NamaAwal;
    private String NamaAkhir;
    private Tabungan tabungan;
    public Nasabah(String NamaAwal, String NamaAkhir){
        this.NamaAwal = NamaAwal;
        this.NamaAkhir = NamaAkhir;
    }
    public String getNamaAwal() {
        return NamaAwal;
    }
    public String getNamaAkhir() {
        return NamaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
