/**
 * Denver Wolfe
 * CH3PC2
 * Programming III - AP CS
 * 9/28/18
 */
public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car(int y, String m, int s) {
        yearModel = y;
        make = m;
        speed = s;
    }

    public void setYearModel(int y) {
        yearModel = y;
    }

    public void setMake(String m) {
        make = m;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public int accelerate(int a) {
        a = speed + 5;
        speed = a;
        return a;
    }

    public int brake(int b) {
        b = speed - 5;
        speed = b;
        return b;
    }

}