
import java.util.Scanner;

public class Lintasanbola {
    public static void main(String[] args) {
        Scanner ikhsan = new Scanner(System.in);

        double r,pLintasan,L1,a;
        double sTakterhingga;
        String nama;

        System.out.println("MENGHITUNG PANJANG LINTASAN BOLA");
        System.out.print("Masukkan Nama Anda : ");
        nama = ikhsan.nextLine();
        System.out.print("Masukkan Ketinggian Bola : ");
        a = ikhsan.nextDouble();
        System.out.print("Masukkan r : ");
        r = ikhsan.nextDouble();
        L1 = (a * r);
        System.out.println("Diketahui Lintasan Pertama dari Sebuah Bola : " + L1);
        sTakterhingga = L1 / (1-r);
        System.out.println("Diketahui S.Tak terhingga dari suatu bola : " + sTakterhingga);
        pLintasan = a + (2*sTakterhingga);
        System.out.println("Jadi Panjang Lintasan Bola dari Awal sampai Berhenti Adalah " + pLintasan);
        if (pLintasan % 2 == 0)
        {System.out.println("Total lintasan adalah bilangan Genap");
        }else{System.out.println("Total lintasan adalah bilangan Ganjil");
        }
    }
}
