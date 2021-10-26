package modul_3.praktikum.kendaraan;

import java.util.Locale;

public class mobil {
    private int roda;
    private int pintu;
    private int jok;

    //overloading (polymorphism)
    public mobil(){

    }

    //overloading (polymorphism)
    public mobil(int roda){
        this.roda = roda;
    }

    //overloading (polymorphism)
    public mobil(int roda, int pintu, int jok){
        this.roda = roda;
    }

    //getter roda
    public int getRoda() {
        return roda;
    }

    //setter roda
    public void setRoda(int roda) {
        this.roda = roda;
    }

    //getter(mendapatkan data)
    public int getPintu() {
        return pintu;
    }

    //seter(mengubah data)
    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    //getter
    public int getJok() {
        return jok;
    }

    //setter
    public void setJok(int jok) {
        this.jok = jok;

    }
    //behaviour
    public String klakson() {
        return "Tin...tin...";
    }

    public void controlpedal(String pedal){
        if(pedal.toLowerCase().equals("gas"))
            System.out.println("Mobil maju");
        else if(pedal.toLowerCase().equals("rem"))
            System.out.println("Mobil berhenti");
        else System.out.println("Perintah ditolak");
    }


}
