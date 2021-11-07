package modul_4.praktikum.overloading;

public class MainTabungan {
    public static void main(String[] args) {
        Tabungan zongli = new Tabungan("zongli", 8081);
        Tabungan yuzu = new Tabungan("yuzu", 8082, 500000, 1234);
        System.out.println("isi saldo Mr" + zongli.getNama() + " adalah " + zongli.getSaldo());
        System.out.println("isi saldo Mr" + yuzu.getNama() + " adalah " + yuzu.getSaldo());

        System.out.println("No pin Mr" + zongli.getNama() + " adalah " + zongli.getPin());
        System.out.println("No pin Mr" + yuzu.getNama() + " adalah " + yuzu.getPin());
    }
}
