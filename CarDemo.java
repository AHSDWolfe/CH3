/**
 * Denver Wolfe
 * CH3PC2
 * Programming III - AP CS
 * 9/28/18
 */
public class CarDemo {

    public static void main(String[] args) {
        //Create new car
        Car Michael = new Car(2001, "Michael", 50);

        //Declare variables
        int y;
        String m;
        int s;
        int a = 0;
        int b = 0;

        //Print out chart
        System.out.println("Year Model" + "\t" + "Make" + "\t" + "Speed");

        y = Michael.getYearModel();
        m = Michael.getMake();
        s = Michael.getSpeed();

        //Print out year model, make, and speed
        System.out.println(y + "\t\t" + m + "\t" + s);

        //Accelerate by 5 5 times
        a = Michael.accelerate(a);
        System.out.println("\n" + "New Speed: " + a);
        a = Michael.accelerate(a);
        System.out.println("New Speed: " + a);
        a = Michael.accelerate(a);
        System.out.println("New Speed: " + a);
        a = Michael.accelerate(a);
        System.out.println("New Speed: " + a);
        a = Michael.accelerate(a);
        System.out.println("New Speed: " + a);

        //Brake by 5 5 times
        b = Michael.brake(b);
        System.out.println("New Speed: " + b);
        b = Michael.brake(b);
        System.out.println("New Speed: " + b);
        b = Michael.brake(b);
        System.out.println("New Speed: " + b);
        b = Michael.brake(b);
        System.out.println("New Speed: " + b);
        b = Michael.brake(b);
        System.out.println("New Speed: " + b);
    }

}