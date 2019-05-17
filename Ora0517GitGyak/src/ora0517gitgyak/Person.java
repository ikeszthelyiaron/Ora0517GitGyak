package ora0517gitgyak;

/**
 *
 * @author user
 */
public class Person {
 
    private String firstName;
    private String lastName;
    private String name = firstName + lastName;
    private String city;
    private String eMailAddress;

    public Person(String firstName, String lastName, String city, String eMailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.eMailAddress = eMailAddress;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getName(){
        return name;
    }

    public String getCity() {
        return city;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }
}
