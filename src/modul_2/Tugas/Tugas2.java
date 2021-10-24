package modul_2.Tugas;

public class Tugas2 {
    public static void main(String[] args) {
        //deklarasi variable
        int A = 10;

        //perulangan while dengan kondisi A > 1
        while(A > 1){

            //menampilkan kalimat "Anak ayam turun" + jumlah A
            System.out.println("Anak ayam turun " + A);

            //A dikurang 1
            A--;

            //Menampilkan kalimat "Mati 1 tinggal" + jumlah A
            System.out.println("Mati 1 tinggal " + A);
        }

        //menampilkan kalimat "Anak ayam turun" + jumlah A
        System.out.println("Anak ayam turun " + A);

        //menampilkan kalimat "Mati 1 tinggal induknya"
        System.out.println("Mati 1 tinggal induknya");
    }
}
