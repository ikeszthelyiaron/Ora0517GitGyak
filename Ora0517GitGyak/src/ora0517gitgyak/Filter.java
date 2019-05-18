package ora0517gitgyak;

import java.util.List;

/**
 *
 * @author user
 */
public class Filter {
    
    public static Person cityFilter(String city, List<Person> persons){
        for (Person person : persons) {
            if(person.getCity().equals(city)){
                return person;
            }
        }
        return null;
    }
}
