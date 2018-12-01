/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ddlab.rnd.practice;

/**
 *
 * @author PIKU
 */
public class ArrayRotation {
    
    private static void rotateRight( int[] a ) {
        
        int last = a[a.length -1 ];
        for( int i = a.length -1 ; i > 0 ; i-- )
            a[i] = a[i-1];
        a[0] = last;
    }
    
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        rotateRight(a);
        
        for( int i : a ) 
            System.out.print(i+" ");
    }
    
}
