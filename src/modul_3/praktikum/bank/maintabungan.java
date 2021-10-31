package modul_3.praktikum.bank;

import java.util.Scanner;

public class maintabungan {
    public static void main(String[] args) {
        Scanner sekener = new Scanner(System.in);

        System.out.println("Saldo awal tabungan\t: ");
        int isi = sekener.nextInt();
        tabungan Tabung = new tabungan(isi);

        System.out.println("Jumlah uang yang diambil\t: ");
        int ambil = sekener.nextInt();
        Tabung.ambiluang(ambil);

        System.out.println("saldo tabungan sekarang\t: ");
        System.out.println(Tabung.getSaldo());

    }
}
