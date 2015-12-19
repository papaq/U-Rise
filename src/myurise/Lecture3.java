/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myurise;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author yural
 */
public final class Lecture3 {

    private Lecture3() {
    }

    public static String Test1_if() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder, Locale.UK);
        double op1 = 4.0;
        double op2 = 1.5;
        double comparer = 5.0;
        if (comparer > Lecture2.Test2_aPowB(op1, op2)) {
            return formatter.format(
                    "%1$.2f in %2$.2f power is less than %3$.2f\n",
                    op1, op2, comparer).toString();
        } else {
            return formatter.format(
                    "%1$.2f in %2$.2f power is grater than %3$.2f\n",
                    op1, op2, comparer).toString();
        }
    }

    public static String Test2_ternary() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder, Locale.UK);
        double op1 = 4.0;
        double op2 = 1.5;
        double comparer = 5.0;
        return comparer > Lecture2.Test2_aPowB(op1, op2)
                ? formatter.format(
                        "%1$.2f in %2$.2f power is less than %3$.2f\n",
                        op1, op2, comparer).toString()
                : formatter.format(
                        "%1$.2f in %2$.2f power is not less than %3$.2f\n",
                        op1, op2, comparer).toString();
    }

    public static void Test3() {
        boolean op1 = true;
        boolean op2 = (Object) op1 instanceof Boolean;
        System.out.format("op1 = %1$b\n", op1);
        System.out.format("!op1 = %1$b\n", !op1);
        System.out.format(
                "(op1 == true && instanceof(op1) == boolean) = %1$b\n",
                op1 && op2
        );
    }

    public static void Test4(Object testNumber) {
        if (!(testNumber instanceof Integer)) {
            System.out.print("Wrong integer value as parameter!\n");
            return;
        }
        switch ((int)testNumber) {
            case 1:
                System.out.print("Test1_if() returns:\n");
                System.out.print(Test1_if());
                break;
            case 2:
                System.out.print("Test2_ternary() returns:\n");
                Test2_ternary();
                break;
            case 3: 
                System.out.print("Test3(1) returns:\n");
                Test4(1);
                break;
            default:
                System.out.print("There is yet no such method!\n");
                break;
        }
    }
    
    public static void Test5(){
        for (int i = 0; i < 5; i++) {
            System.out.format("Step %1$d:\n", i);
            Lecture2.Test4();
        }
    }
    
    public static void Test6(){
        int i = 1;
        while (i < 11) {
            System.out.format("%1$d\n", i++);
        }
    }
}
