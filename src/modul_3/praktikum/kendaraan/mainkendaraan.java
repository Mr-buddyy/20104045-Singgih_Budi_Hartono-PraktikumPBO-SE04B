package modul_3.praktikum.kendaraan;

public class mainkendaraan {
    public static void main(String[] args) {
        //Deklarasi objek
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil(4);
        mobil mobil3 = new mobil(4, 2, 2);

        System.out.println("mobil1");
        System.out.println("Roda\t: " +mobil1.getRoda());

        System.out.println(mobil2);

        System.out.println("mobil3");
        System.out.println("Roda\t: " +mobil3.getRoda());

        mobil3.setRoda(8);
        System.out.println("mobil3");
        System.out.println("Roda\t: " +mobil3.getRoda());

        //behaviour
        System.out.println("Bunyi klakson mobil\t: "+ mobil3.klakson());
        mobil3.controlpedal("GAS");
        mobil3.controlpedal("rEm");
        mobil3.controlpedal("Apaaja");
    }
}
