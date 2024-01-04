package week06_DeeperInClasses;

public class toStringKeyword {
    int id;
    String name;

    public toStringKeyword(int id, String name){
        this.name= name;
        this.id= id;
    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args){
        
    }
}
