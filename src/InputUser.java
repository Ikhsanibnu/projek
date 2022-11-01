import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        //scanner
        String studentName;
        int studentAge;
        Scanner hasan = new Scanner(System.in);
        System.out.println("Input Fullname : ");
        studentName = hasan.nextLine();
        System.out.println("Input Age : ");
        studentAge = hasan.nextInt();
        System.out.println("Your Fullname is " + studentName);
        System.out.println("Your Age Is " + studentAge);


    }
}