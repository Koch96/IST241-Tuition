package tuition;

/** @author sak5680 */

public class FTStudent extends Student{
    private String location;
    
    public void setLocation(String i){
        location = i;
    }
    
    public String getLocation(){
        return location;
    }
    
    public double calcTuition(){
        location = location.toLowerCase();
        if(location.equals("instate")){
            tuition = 5000;
        } else {
            tuition = 7500;
        }
        return tuition;
    }
}
