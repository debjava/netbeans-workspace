package com.ddlab.rnd.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        
        return e2.getAge() - e1.getAge();
    }
}

class SalComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        
        return e2.getSal() - e2.getSal();
    }
}

public class TestMultiComparator {
    
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        for (int i = 1000 , j = 23; i < 5000; i=i+1000 , j++) {
            empList.add( new Employee(j, "Name-"+j, i));
        }
        
        
        System.out.println("empList--->"+empList);
        
        List<Comparator<? super Employee>> multiList = new ArrayList<>();
        multiList.add(new AgeComparator());
        multiList.add(new SalComparator());
        
        
        MultiComparator<Employee> multi = new MultiComparator<>(multiList);
        multi.sort(empList, multi);
        
        System.out.println("Multi----->"+empList);
    
    }
    
}
