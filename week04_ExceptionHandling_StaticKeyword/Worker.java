package week04_ExceptionHandling_StaticKeyword;

public class Worker {
    private String name;
    private int salary;
    static int counter=0;

    Worker(){
        counter++;
    }

    Worker(String name,int salary){
        counter++;
        this.name=name;
        this.salary=salary;
    }

    void setName(String name){
        this.name=name;
    }
    void setSalary(int salary){
        if(salary<=0) throw new IllegalArgumentException("Salary amount must be greater than zero");

        else 
            this.salary=salary;
    }
    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }
}
