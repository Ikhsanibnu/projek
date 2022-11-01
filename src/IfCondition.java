import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner hasan = new Scanner(System.in);
        System.out.println("Input Password :");
        String Password = hasan.nextLine();
        if(Password.equals("javaclass")){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
}
