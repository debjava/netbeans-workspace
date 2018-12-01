package com.ddlab.rnd.core;

import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
    
    public static void main(String[] args) {
        TreeSet empSet = new TreeSet<>();
        for (int i = 1000 , j = 23; i < 5000; i=i+1000 , j++) {
            empSet.add( new Employee(j, "Name-"+j, i));
        }
        
        System.out.println("TreeSet--->"+empSet);
        
        Set<Employee> ageSet = empSet.headSet( new Employee(25, "Name-1", 2000));
        
        System.out.println("ageSet--->"+ageSet);
        
    }
    
}
