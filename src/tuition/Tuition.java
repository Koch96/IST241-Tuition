
package tuition;

import java.util.Scanner;


/** @author sak5680 */

public class Tuition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PTStudent pt1 = new PTStudent();
        FTStudent ft1 = new FTStudent();
        
        String studentStatus = "full";
        
        if(studentStatus.equals("part")){
            System.out.print("Enter name: ");
            pt1.setName(sc.next());
            System.out.print("Enter ID: ");
            pt1.setID(sc.next());
            System.out.print("Enter # of credits: ");
            pt1.setCredits(sc.nextDouble());

            System.out.println("\n\nName: " + pt1.getName());
            System.out.println("Student ID: " + pt1.getID());
            System.out.println("Number of Credits: " + pt1.getCredits());
            System.out.printf("Cost: $ %.2f%n", pt1.calcTuition());
        } else if (studentStatus.equals("full")){
            System.out.print("Enter name: ");
            ft1.setName(sc.next());
            System.out.print("Enter ID: ");
            ft1.setID(sc.next());
            System.out.print("In State or Out of State: ");
            ft1.setLocation(sc.next());

            System.out.println("\n\nName: " + ft1.getName());
            System.out.println("Student ID: " + ft1.getID());
            System.out.println("Location: " + ft1.getLocation());
            System.out.printf("Cost: $ %.2f%n", ft1.calcTuition());
        }
    }

}
