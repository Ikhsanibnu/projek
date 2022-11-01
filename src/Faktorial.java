import java.sql.SQLOutput;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int angka;
        int Faktorial = 1;
        System.out.println("masukan input : ");
        angka = inputData.nextInt();
        for (int i = 1; i<=angka;i++){
            Faktorial = Faktorial*i;
        }
        System.out.println("hasil faktorial :" +Faktorial);
        }
    }