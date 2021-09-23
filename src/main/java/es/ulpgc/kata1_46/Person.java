
package es.ulpgc.kata1_46;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
    
    private final String name;
    private final LocalDate birthdate;
    

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    int getAge() {           
        return Period.between(birthdate, LocalDate.now()).getYears();            
    }
}