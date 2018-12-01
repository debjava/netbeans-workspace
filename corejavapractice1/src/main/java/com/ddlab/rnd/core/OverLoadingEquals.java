package com.ddlab.rnd.core;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    public boolean equals(Subject obj) {
        System.out.println("-----Subject Called ----");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

public class OverLoadingEquals {

    public static void main(String[] args) {
        Subject s1 = new Subject("Physics");
        Subject s2 = new Subject("Physics");
        System.out.println("s1.equals(s2)"+s1.equals(s2));//true
        
        Set<Subject> set = new HashSet<Subject>();
        set.add(s1);
        System.out.println("set.contains(s2)---->"+set.contains(s2)); //false
        //https://coderanch.com/t/378204/java/Overloading-overriding-equals-method
    }
}
