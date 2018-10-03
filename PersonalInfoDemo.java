/**
 * Denver Wolfe
 * CH3PC3
 * Programming III - AP CS
 * 10/1/18
 */
public class PersonalInfoDemo {

    public static void main(String[] args) {
        //Create new people
        PersonalInfo p1 = new PersonalInfo("John Doe", "123 Fake Road", 25, 
                "(111)111-1111");
        PersonalInfo p2 = new PersonalInfo("Bill Bob", "456 Example Street",
                59, "(123)456-7890");
        PersonalInfo p3 = new PersonalInfo("Maria Rodriguez",
                "789 Imaginary Lane", 18, "(000)111-9999");
        
        //Declare Variables
        String n, a, p;
        int ag;
        
        //Print out chart
        System.out.println("Name" + "\t\t" + "Address" + "\t\t\t" + "Age" + "\t"
                + "Phone Number");
        
        //Give variables value and print out then repeat
        n = p1.getName();
        a = p1.getAddress();
        ag = p1.getAge();
        p = p1.getPhoneNumber();
        
        System.out.println(n + "\t" + a + "\t\t" + ag + "\t" + p);
        
        n = p2.getName();
        a = p2.getAddress();
        ag = p2.getAge();
        p = p2.getPhoneNumber();
        
        System.out.println(n + "\t" + a + "\t" + ag + "\t" + p);
        
        n = p3.getName();
        a = p3.getAddress();
        ag = p3.getAge();
        p = p3.getPhoneNumber();
        
        System.out.println(n + "\t" + a + "\t" + ag + "\t" + p);
    }

}
