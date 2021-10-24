package modul_2.Praktikum;

public class modifier {
    int angkaNON = 1;
    public int angkaPUBLIC = 10;
    private int angkaPRIVATE = 100;
    protected int angkaPROTECTED = 1000;

    public void printAngkaPrivat(){
        System.out.println(angkaPRIVATE);
    }
}
