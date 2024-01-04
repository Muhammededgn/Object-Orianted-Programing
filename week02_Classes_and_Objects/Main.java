package week02_Classes_and_Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker worker1 = new Worker();

        worker1.name = input.nextLine();
        worker1.socialSecurityNumber = input.nextInt();
        worker1.wage=input.nextFloat();
        worker1.workingHours=input.nextInt();

        worker1.displayInfo();
        worker1.displaySalary();

        input.close();
    }
}
