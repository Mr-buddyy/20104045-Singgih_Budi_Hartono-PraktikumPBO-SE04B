package modul_3.praktikum.bank;

public class tabungan {
    private int saldo;

    public tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambiluang(int jumlah){
        saldo -= jumlah;
    }
    public int getSaldo(){
        return saldo;
    }
}
