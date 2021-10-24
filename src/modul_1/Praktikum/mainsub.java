package modul_1.Praktikum;

import modul_1.Praktikum.protec.modifiersubclass;

public class mainsub extends modifiersubclass {
    public static void main(String[] args) {

        //Dari subclass ke superclass
        //object
        mainsub mainsub = new mainsub();

        System.out.println(mainsub.tekspublic);
        System.out.println(mainsub.teksprotect);
        //System.out.println(mainsub.teksprivate);
        //System.out.println(mainsub.teks);

    }
}
