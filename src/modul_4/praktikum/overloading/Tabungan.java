package modul_4.praktikum.overloading;

public class Tabungan {
    private String nama;
    private int noRek;
    private int saldo;
    private int pin;

    //Overloading Consturctor
    public Tabungan(String nama, int noRek, int saldo, int pin) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void simpanUang(int jumlah){
        saldo -= jumlah;
    }

    public void tarikUang(int jumlahTarik){
        this.saldo -= jumlahTarik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pinBaru) {
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

    //Overloading Consturctor
    public Tabungan(String nama, int noRek) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = 1000000;
        this.pin = 123456;

    }
}
