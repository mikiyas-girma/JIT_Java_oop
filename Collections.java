
package miki_lab;
import java.util.*;

public class NewMain {

  
    public static void main(String[] args) {
LinkedList<String> cars = new LinkedList<String>();
ArrayList<String> list=new ArrayList<String>();
Map<String, Integer> countrycode=new HashMap<String ,Integer>();
countrycode.put("ETS", 3523);
countrycode.put("MTN", 2233);
countrycode.put("ETC", 2211);
countrycode.put("ETS", 3523);

System.out.println(countrycode.keySet());
     System.out.println(countrycode.values());


cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    list.add("2000");
    list.add("1937");
    list.add("New model");
    list.add("2023");

    
    
    System.out.println(cars); 
    System.out.println(list); 
        
        
        
    }
    
}
