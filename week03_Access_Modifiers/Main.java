package week03_Access_Modifiers;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Owner Name=");
        Account ac1= new Account(input.nextLine(), 0.0);
        System.out.println("Deposit Amount=");
        ac1.add(input.nextDouble());

        System.out.println("Please enter your password=");
        int password=input.nextInt(); int a=0;
        while(ac1.isTrue(password)==0){
            if(a==3){
                 System.out.println("Your account has been blocked, please try again later");
                 System.exit(0);
            }
            System.out.println("Wrong Password please try again=");
            password=input.nextInt();
            a++;
        }
        ac1.getOwnerName();
        System.out.println("Withdraw Amount=");
        ac1.withdraw(input.nextDouble());
        input.close(); 
    }
}
