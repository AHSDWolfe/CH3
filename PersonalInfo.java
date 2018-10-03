/*
 * Denver Wolfe
 * CH3PC3
 * Programming III - AP CS
 * 10/1/18
 */
public class PersonalInfo {
    
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public PersonalInfo(String n, String a, int ag, String p) {
        name = n;
        address = a;
        age = ag;
        phoneNumber = p;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setAge(int ag){
        age = ag;
    }
    
    public void setPhoneNumber(String p){
        phoneNumber = p;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
