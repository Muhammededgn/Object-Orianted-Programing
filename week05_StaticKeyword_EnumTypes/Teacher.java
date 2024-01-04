package week05_StaticKeyword_EnumTypes;

    enum branch{
        MATH("information regarding math"),
        PHYSICS("information regarding physics"),
        CSI("information regarding csi"),
        ENG("information regarding ENG");

        private final String information;
        branch(String information){
            this.information=information;
        }
        public String get_information(){
            return information;
        }
        
    }
public class Teacher {
    private int id;
    private branch branch;
    
    public void set_id(int id){
        this.id=id;
    }
    public int get_id(){
        return id;
    }
    public branch get_branch(){
            return branch;
    }
    public Teacher(int id,branch branch){
        set_id(id);
        this.branch=branch;
    }  
}
