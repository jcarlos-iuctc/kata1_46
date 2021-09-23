package es.ulpgc.kata1_46;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        
        Calendar birthdate = Calendar.getInstance();
        birthdate.set(1980, 1, 1);        
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName() + " tiene " + person.getAge() + ".");
                
        
    }
    
      
   
    
}
