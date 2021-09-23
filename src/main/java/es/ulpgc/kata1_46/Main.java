package es.ulpgc.kata1_46;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
               
        LocalDate birthdate = LocalDate.of(1980, Month.JANUARY,1 );        
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName() + " tiene " + person.getAge() + ".");                
        
    }
    
      
   
    
}
