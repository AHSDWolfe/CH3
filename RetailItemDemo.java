/**
 * Denver Wolfe
 * CH3PC6
 * Programming III - AP CS
 * 10/3/18
 */
public class RetailItemDemo {

    public static void main(String[] args) {
        
        RetailItem r1 = new RetailItem(800, 5.0);
        RetailItem r2 = new RetailItem(400, 2.5);
        RetailItem r3 = new RetailItem(200, 1.25);
        
        
        int w;
        double d;
        
        System.out.println("Widgets Produced" + "\t" + "Days Taken");
        
        w = r1.getWidgets();
        d = r1.getDays();
        
        System.out.println(w + "\t\t\t" + d);
        
        w = r2.getWidgets();
        d = r2.getDays();
        
        System.out.println(w + "\t\t\t" + d);
        
        w = r3.getWidgets();
        d = r3.getDays();
        
        System.out.println(w + "\t\t\t" + d);
    }

}
