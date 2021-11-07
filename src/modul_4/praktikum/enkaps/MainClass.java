package modul_4.praktikum.enkaps;

public class MainClass {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("Ei", 8110, 50000, 100110);
        System.out.println("Nama\t: " + tabungan.getNama());
        System.out.println("No rekening\t: " + tabungan.getNoRekening());
        System.out.println("Pin\t: " + tabungan.getPin());
        System.out.println("Saldo\t: " + tabungan.getSaldo());

    }
}
