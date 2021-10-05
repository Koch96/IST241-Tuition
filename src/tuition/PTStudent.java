package tuition;

/** @author sak5680 */

public class PTStudent extends Student{
    private double credits;
    
    public void setCredits(double c) {
        credits = c;
    }
    
    public double getCredits() {
        return credits;
    }
    
    public double calcTuition(){
        tuition = credits * 300;
        return tuition;
    }
}
