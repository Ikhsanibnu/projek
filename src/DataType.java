public class DataType {
    //Primitive Data Type
    // int, double, float, byte, long, char
    public static void main(String[] args) {
        // Menghitung luas dan keliling persedgi panjang
        int Panjang;
        int Lebar;
        int Luas;
        int Keliling;

        Panjang = 4;
        Lebar = 5;
        Luas = Panjang * Lebar;
        Keliling = 2 *(Panjang+Lebar);

        System.out.println("Luas persegi panjang " + Luas);
        System.out.println("Keliling persegi panjang adalah " + Keliling);

        //Karakter
        char huruf;
        huruf = 'b';
        if (huruf=='b') {
            System.out.println("Hurufnya adalah " + huruf);
        }else {
            System.out.println("Huruf bukan b");
        }

    }
}
