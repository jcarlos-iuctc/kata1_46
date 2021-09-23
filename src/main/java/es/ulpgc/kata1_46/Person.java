
package es.ulpgc.kata1_46;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
    
    private final String name;
    private final Calendar birthdate;
    

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    int getAge() {                
        Calendar now = GregorianCalendar.getInstance();
        
        return millisecondsToYears(now.getTimeInMillis()-birthdate.getTimeInMillis());
        
        
    }

    private int millisecondsToYears(long l) {        
        final long Milliseconds_Per_Year = (long) (365.25*24*60*60*1000L);    
        return (int) (l/Milliseconds_Per_Year);
    }

  
    
    
    
    
    

}

