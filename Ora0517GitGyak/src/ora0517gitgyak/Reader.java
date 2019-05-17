package ora0517gitgyak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Reader {
    
    public static ArrayList<Person> read() throws FileNotFoundException{
        ArrayList<Person> persons = new ArrayList<>();
        Scanner sc = new Scanner(new File("us-500.csv"));
        
        sc.nextLine();
        while(sc.hasNext()){
            String[] parts = sc.nextLine().split(",");
            Person person = new Person(parts[0], parts[1], parts[4],parts[10]);
            persons.add(person);
        }
        return persons;
        
    }
    
}
