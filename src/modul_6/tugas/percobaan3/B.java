package modul_6.tugas.percobaan3;

import modul_6.tugas.percobaan3.A;

class B extends A {
    protected int z;
    public void getJumlah(){
        System.out.println("jumlah:"+ (x+y+z));
    }
    public void setZ(int z){
        this.z = z; }
}
