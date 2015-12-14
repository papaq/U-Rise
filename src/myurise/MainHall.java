/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myurise;

/**
 *
 * @author yural
 */
public class MainHall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // L E C T U R E 1,  C L A S S W O R K
        System.out.println("---- Lecture 1 ----\n");
        Lecture1.SayHi();
        System.out.println();
        Lecture1.ShowBasicTypes();
        System.out.println();
        
        // L E C T U R E 1,  H O M E W O R K
        Lecture1.HomeWork();
        System.out.println();
        
        // L E C T U R E 2,  H O M E W O R K
        System.out.println("---- Lecture 2 ----\n");
        Lecture2.Test1();
        System.out.println();
        
        double a = 16.0;
        double b = 3.5;
        System.out.format("%1$.2f in %2$.2f power = %3$.2f\n", 
                a, b, Lecture2.Test2_aPowB(a, b));
        System.out.println();
        
        Lecture2.Test3("here could be your ad");
        System.out.println();
        
        Lecture2.Test4();
        System.out.println();
        
        // L E C T U R E 2,  C L A S S W O R K
        System.out.println("---- Lecture 3 ----\n");
    }
    
    
}

