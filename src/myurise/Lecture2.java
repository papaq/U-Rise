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
public final class Lecture2 {
    private Lecture2() {
        
    }
    
    public static void Test1() {
        int op1 = 90;
        int op2 = 29;
        System.out.format("op1 = %1$d\n", op1);
        System.out.format("op2 = %1$d\n", op2);
        System.out.format("op1 + op2 = %1$d\n", op1 + op2);
        System.out.format("op1 - op2 = %1$d\n", op1 - op2);
        System.out.format("op1 * op2 = %1$d\n", op1 * op2);
        System.out.format("op1 / op2 = %1$d\n", op1 / op2);
        System.out.println("op1 % op2 = " + op1 % op2);
        System.out.format("op1 ++ = %1$d\n", ++op1);
        System.out.format("(op1 != op2) = %1$b\n", op1 != op2);
        System.out.println("etc...");
    }
    
    public static double Test2_aPowB(double a, double b){
        return Math.pow(a, b);
    }
    
    public static void Test3(String str) {
        System.out.println(str);
    }
    
    public static void Test4() {
        System.out.println("Watch Lecture1.java");
    }
}
