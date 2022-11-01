import sun.misc.Unsafe;

public class deklarasiarray {
    public static void main(String[] args) {
        // deklarasi array e.g
        int[] angka = new int[3]; // 3 cell - index dari 0 sampai 2
        String[] nama = new String[4]; // 4 cell - index dari 0 sampai 3

        //masukan value ke dalam array angka
        angka[0] = 2;
        angka[2] = 4;

        //mengambil value dari array angka
        int s = angka[2];

        //masukan value ke dalam array String nama
        nama[2] = "Budi";
        nama[3] = "Asih";

        //mengambil value dari array String nama
        String u = nama[2];
        String t = nama[3];

        // deklarasi array dengan cara lain
        int[] number = {1,45,7,34,89,12}; // ada 6 cell - integer
        for (int index=0;index<number.length;index++){
            System.out.println("Angka dalam Array Number = "+ number[index]);
        }
    }
}
