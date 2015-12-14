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
public final class Lecture1 {
    private Lecture1() {
    }
    
    public static void SayHi() {
        System.out.println("Hello World!");
    }
    
    public static void ShowBasicTypes() {
        String myStringValue = "Hello U-Rise!";
        boolean myBoolValue = true;
        char myCharValue = '\\';
        short myShortValue = 126;
        int myIntValue = myShortValue * 8;
        long myLongValue = 1500L;
        float myFloatValue = 5.6F;
        double myDoubleValue = 7.5e3D;
        
        System.out.format("%1$-10s%2$s\n", "TYPE", "VALUE");
        System.out.format("%1$-10s%2$b\n", "boolean", myBoolValue);
        System.out.format("%1$-10s%2$c\n", "char", myCharValue);
        System.out.format("%1$-10s%2$s\n", "String", myStringValue);
        System.out.format("%1$-10s%2$s\n", "short", myShortValue);
        System.out.format("%1$-10s%2$s\n", "int", myIntValue);
        System.out.format("%1$-10s%2$s\n", "long", myLongValue);
        System.out.format("%1$-10s%2$.5f\n", "int", myFloatValue);
        System.out.format("%1$-10s%2$.5e\n", "double", myDoubleValue);
    }
    
    public static void HomeWork() {
        boolean boolV = true;
        int intV = 100;
        float floatV = 0.99f;
        
        System.out.println("Hello, U-Rise!\n"
                + "There is " + boolV + ", that there are "
                + intV + " percent success with " + floatV + " happiness.");
    }
}
