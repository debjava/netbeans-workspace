package com.ddlab.rnd.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMyComparator1 {
    
    public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList<Employee>();
        
        Employee e1 = new Employee(23, "John", 9000);
        Employee e2 = new Employee(28, "Vidya", 2000);
        Employee e3 = new Employee(27, "Ram", 5000);
        Employee e4 = new Employee(33, "Hari", 1000);
        Employee e5 = new Employee(25, "Shyam", 11000);
        
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        
        System.out.println("EmpList--->"+empList);
//        [Employee{age=23, name=John, sal=9000}, Employee{age=28, name=Vidya, sal=2000}, Employee{age=27, name=Ram, sal=5000}, Employee{age=33, name=Hari, sal=1000}, Employee{age=25, name=Shyam, sal=11000}]
        Collections.sort(empList, new MyComparator());
        System.out.println("EmpList--->"+empList);
        //[Employee{age=33, name=Hari, sal=1000}, Employee{age=28, name=Vidya, sal=2000}, Employee{age=27, name=Ram, sal=5000}, Employee{age=25, name=Shyam, sal=11000}, Employee{age=23, name=John, sal=9000}]
    }
            
    
}
