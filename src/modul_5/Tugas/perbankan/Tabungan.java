package modul_5.Tugas.perbankan;

public class Tabungan {
    private int Saldo;

    public Tabungan(int Saldo) {
        this.Saldo = Saldo;
    }

    public int getSaldo() {
        return Saldo;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah <= Saldo) {
            Saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
    public int simpanUang(int jumlah){
        Saldo+= jumlah;
        return Saldo;
    }
}
