
package com.ddlab.rnd.core1;

public class Test1 {
    
    public static void show(String s) {
        System.out.println("----String----");
    }
    
    public static void show(Object o) {
        System.out.println("----Object----");
    }
    
    public static void main(String[] args) {
        
        show((Object)"abc");//----Object----
    }
    
}
