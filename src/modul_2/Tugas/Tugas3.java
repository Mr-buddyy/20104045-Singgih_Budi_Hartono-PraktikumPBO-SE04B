package modul_2.Tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        //deklarasi variabel
        int [] A, B, C;
        int data;

        //scanner untuk input data
        Scanner inputan = new Scanner(System.in);

        //memasukkan jumlah testcase
        System.out.print("Masukan Jumlah Testcase: ");
        data = inputan.nextInt();
        A = new int[data];
        B = new int[data];
        C = new int[data];

        //input data sesuai jumlah testcase
        for (int i = 0; i < data; i++) {
            System.out.print("Masukan A" + (i + 1) + " : ");
            A[i] = inputan.nextInt();
            System.out.print("Masukan B" + (i + 1) + " : ");
            B[i] = inputan.nextInt();
            System.out.print("Masukan C" + (i + 1) + " : ");
            C[i] = inputan.nextInt();
            System.out.println();
        }
        //operasi matematika a+b-c
        for (int i = 0; i < data; i++) {
            System.out.print("A" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(A[i] + B[i] - C[i]);
        }
    }
}
