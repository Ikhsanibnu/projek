import java.util.Scanner;

public class Method1A {
    public static void Penjumlahan (int x, int y){
        int hasil_jumlah = x+y;
        System.out.println("Hasilnya adalah " + hasil_jumlah);
    }
    public static void CetakSemuaMember(String[] anggota){
        for(int index=0;index<anggota.length;index++){
            System.out.println(anggota[index]);
        }
    }

    public static void main(String[] args) {
        Scanner inpudata = new Scanner(System.in);
            System.out.print("Masukkan Angka 1 = ");
            int angka1 = inpudata.nextInt();
            System.out.print("Masukkan Angka 2 = ");
            int angka2 = inpudata.nextInt();
            Penjumlahan(angka1,angka2);

            String[] member = new String[3];
            member[0] = "Joko";
            member[1] = "Syarif";
            member[2] = "Teguh";
            CetakSemuaMember(member);
        }

    }
