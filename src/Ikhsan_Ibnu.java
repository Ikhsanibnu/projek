import java.util.Scanner;

public class Ikhsan_Ibnu {
    public static void main(String[] args) {
        Scanner Ikhsan = new Scanner(System.in);
        String[] Nama = new String[6];

        for (int e = 0; e < Nama.length; e++) {
            System.out.print("Masukan Nama ke-" + e + ": ");
            Nama[e] = Ikhsan.nextLine();
        }
        System.out.println("\n===========================\n");
        for (String n : Nama) {
            if ((n.contains("a")) || (n.contains("i")) || (n.contains("A")) || (n.contains("I"))) {
                System.out.println(n + " Ada 'a' Atau 'i' ");
            } else {
                System.out.println(n + " Tidak ada 'a' Atau 'i' ");
            }
        }
        System.out.println("\n===========================\n");
        System.out.println("\n \n");
        {
            for (int row = 1; row < 9; row++) {
                for (int col = 1; col < 10; col++) {
                    if (((row == 1 || row == 8) && col % 2 == 1) || col == 10 / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("\n \n");
            {
                for (int row = 1; row < 9; row++) {
                    for (int col = 1; col < 10; col++) {
                        if (((row == 1 || row == 8) && col % 2 == 1) || col == 10 / 2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
            System.out.println("\n \n");
            {
                int fp=20/2;
                int sp=20/2;
                for (int k=1;k<=10;k++)
                {
                    for (int l=1;l<=20;l++)
                    {
                        if (l==fp || l==sp || k==10/2 && l>fp && l<sp && l%2==0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                    fp--;
                    sp++;
                }
            }
            System.out.println("\n \n");
            System.out.println("\n=========Ikhsan Ibnu Aji========\n");
            System.out.println("\n==========TERIMA KASIH==========\n");
        }
    }
}
