package week02_Classes_and_Objects;

public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;
    
    void displayInfo(){
        System.out.println("Name="+name + " SSN=" +socialSecurityNumber);
    }

    void displaySalary(){
        System.out.printf("%f",wage*workingHours);
    }
}
