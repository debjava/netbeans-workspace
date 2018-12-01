package com.ddlab.rnd.core;

import java.util.Set;
import java.util.TreeSet;

public class TestHeadNTailHashSet {
    
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            ts.add(i);
        }
        
        Set<Integer> headSet = ts.headSet(5);
        System.out.println("HeadSet--->"+headSet);//[0, 1, 2, 3, 4]
        
        Set<Integer> tailSet = ts.tailSet(5);
        System.out.println("TailSet--->"+tailSet);//[5, 6, 7, 8, 9]
        
        
    }
    
}
