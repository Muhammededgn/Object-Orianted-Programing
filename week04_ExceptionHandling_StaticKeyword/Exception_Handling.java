package week04_ExceptionHandling_StaticKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int a;
        Scanner input= new Scanner(System.in);
        try{
            System.out.println("Please Enter A Integer=");
            a=input.nextInt();
            System.out.println(a);
        }catch(InputMismatchException e){
            System.out.println("Wrong Data Type");
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
