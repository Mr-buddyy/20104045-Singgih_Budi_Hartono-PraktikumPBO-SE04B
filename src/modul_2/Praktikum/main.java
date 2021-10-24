package modul_2.Praktikum;

import modul_2.Praktikum.protec.modifierprotec;

public class main {
    public static void main(String[] args) {
        //Deklarasi objek dari calss modifier
        //From calss modifier in same package
        modifier modif = new modifier();

        //Non modifier
        System.out.println(modif.angkaNON);
        //public modifier
        System.out.println(modif.angkaPUBLIC);
        //protect modifier
        System.out.println(modif.angkaPROTECTED);

        //private
        modif.printAngkaPrivat();

        //from class modifierprotect in different package
        modifierprotec modifprotec = new modifierprotec();

        //can access just public
        System.out.println(modifprotec.tekspublic);

    }
}
