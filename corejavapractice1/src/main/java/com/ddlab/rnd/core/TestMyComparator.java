
package com.ddlab.rnd.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMyComparator {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        for (int i = 1000 , j = 23; i < 5000; i=i+1000 , j++) {
            empList.add( new Employee(j, "Name-"+j, i));
        }
        System.out.println("empList--->"+empList);
        
        Collections.sort(empList , new MyComparator());
        
        System.out.println("empList--->"+empList);
    }
}
