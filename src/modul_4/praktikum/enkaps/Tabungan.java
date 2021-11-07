package modul_4.praktikum.enkaps;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    //Constructor
    public Tabungan(String nama, int noRekening, int saldo, int pin){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }
    //Encaptulation
    public String getNama() {
        return nama;
    }
    //Encaptulation
    public int getNoRekening() {
        return noRekening;
    }
    //Encaptulation
    public int getSaldo() {
        return saldo;
    }
    //Encaptulation
    public int getPin() {
        return pin;
    }
}
