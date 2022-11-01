import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
        String[] belanjasaya = new String[10];
        for (int index=0;index<belanjasaya.length;index++) {
            System.out.print("masukan nama barang :");
            belanjasaya [index] = inputdata.nextLine();
        }



    }
}
