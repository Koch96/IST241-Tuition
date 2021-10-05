package tuition;

/** @author sak5680 */
public class Student {
    protected String name;
    protected String studentID;
    protected double tuition;
    
    public void setName(String n){
        name = n;
    }
    
    public void setID(String id){
        studentID = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getID() {
        return studentID;
    }
}
