package com.ddlab.rnd.core;
import java.util.Comparator;
public class MyComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        
        if( e2.getAge() > e1.getAge() && e2.getSal() < e1.getSal())
            return 1;
        else 
            return -1;
    }
}
