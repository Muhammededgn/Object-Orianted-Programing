package week04_ExceptionHandling_StaticKeyword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Worker wk1=new Worker("wk1",0); 
        Worker wk2=new Worker("wk2",0); 
        Worker wk3=new Worker("wk3",0); 
        System.out.println(Worker.counter);
        input.close();
        wk1.getSalary(); wk2.getSalary(); wk3.getSalary();
    }
}
