import java.util.Scanner;

public class livecoding {
    public static void main(String[] args) {
        Scanner ikhsan = new Scanner(System.in);
        int input1 ;
        int input2 ;
        int hasil ;
        System.out.println("masukan input1 : ");
        input1 = ikhsan.nextInt();
        System.out.println("masukan input2 : ");
        input2 = ikhsan.nextInt();
        for (int N = input1;N<=input2;N++){
            if ((N%3==0)&&(N%7==0)){
                System.out.println("Angka : "+N);
            }else {
                System.out.println("Tidak ada Angka kelipatan 3 dan 7");
            }
        }
    }
}
