package com.ddlab.rnd.core;

public class Employee implements Comparable<Employee>{
    
    private int age;
    private String name;
    private int sal;

    public Employee(int age, String name, int sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - ((Employee)o).getAge();
    }
    
}
