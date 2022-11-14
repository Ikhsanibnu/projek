import java.util.Random;
import java.util.Scanner;

public class Vaksin {
    int jumVaksin = 3;
    static int totalJumlahPenerimaVaksin = 12;
    public static String[] Pfizer = new String[4];
    public static String[] Sinopharm = new  String[4];
    public static String[] Moderna = new String[4];

    public static void PrintInfoPasienVaksin(){
        int totalPfizer = 0;
        int totalSisaKuota =0;
        for (int index=0; index< Pfizer.length; index++){
            if (Pfizer[index] != null){
                totalPfizer++;
            }
        }
        int totalSinopharm=0;
        for (int index = 0; index< Sinopharm.length;index++){
            if (Sinopharm[index] != null){
                totalSinopharm++;
            }
        }
        int totaModerna = 0;
        for (int index = 0;index< Moderna.length;index++){
            if (Moderna[index] != null) {
                totaModerna++;
            }
        }
        totalSisaKuota = totalJumlahPenerimaVaksin - totalPfizer - totalSinopharm - totaModerna;
        System.out.println("Total Pasien Pfizer : " + totalPfizer + " | total pasien sinoparm : " + totalSinopharm + " |total pasien moderna : "+ totaModerna);
        System.out.println("jumlah seluruh vaksin : " + totalJumlahPenerimaVaksin + " | total sisa kuota : " + totalSisaKuota);
        System.out.println();

    }
    public static void ChekIndexArray(String[] myArray,String pasien){
        int indexNow = 0;
        for (int index =0 ; index< myArray.length;index++){
            if (myArray[index] != null){
                indexNow= index+1;
            }
        }
        if (indexNow< myArray.length){
            myArray[indexNow] = pasien;
        }
    }
    public static void simpanPasien (int angakaRandom, String pasien){
        switch (angakaRandom){
            case 1:
                ChekIndexArray(Pfizer,pasien);
                System.out.println("anda mendapat vaksin Pfizer");
                PrintInfoPasienVaksin();
                break;
            case 2:
                ChekIndexArray(Sinopharm,pasien);
                System.out.println("anda mendapat vaksin Sinoparm");
                PrintInfoPasienVaksin();
                break;
            case 3:
                ChekIndexArray(Moderna,pasien);
                System.out.println("anda mendapat vaksin Moderna");
                PrintInfoPasienVaksin();
                break;
        }
    }
    public static void inputPasien(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.print("Nama pasien = ");
            String namaPasien = inputData.nextLine();
            if (namaPasien.isBlank()) {
                System.out.println("nama pasien wajib diisi ");
                inputPasien();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanPasien(JenisRandom,namaPasien);
            }
        }
    }

    public static void main(String[] args) {
        inputPasien();
    }
}

