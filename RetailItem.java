/**
 * Denver Wolfe
 * CH3PC6
 * Programming III - AP CS
 * 10/3/18
 */
public class RetailItem {
    
    private int widgetsProduced;
    private double days;
    
    public RetailItem(int w, double d){
        widgetsProduced = w;
        days = d;
    }
    
    public void setWidgetsProduced(int w){
        widgetsProduced = w;
    }
    
    public void setDays(double d){
        days = d;
    }
    
    public int getWidgets(){
        return widgetsProduced;
    }
    
    public double getDays(){
        return days;
    }
}
