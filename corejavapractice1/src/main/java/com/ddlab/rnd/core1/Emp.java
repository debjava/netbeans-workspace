package com.ddlab.rnd.core1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp implements Comparable {

    private int age;
    private String name;

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int compareTo(Emp o) {
        System.out.println("---- Emp Called -----");
        return this.age - o.getAge();
    }
    
    public int compareTo(Object o) {
        System.out.println("---- Object Called -----");
        return this.age - ((Emp) o).getAge();
    }
    
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        for (int j = 23; j < 33;  j++) {
            empList.add( new Emp( j, "Name-"+j ));
        }
        System.out.println("empList--->"+empList);
        
        Collections.sort(empList);
        
        System.out.println("empList--->"+empList);
    }

}
