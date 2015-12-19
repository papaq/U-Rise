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
public final class ExecuteLectures {

    private ExecuteLectures() {

    }

    // L E C T U R E 1
    
    public static void Lecture1() {
        // C L A S S W O R K
        System.out.println("---- Lecture 1 ----\n");
        Lecture1.SayHi();
        System.out.println();
        Lecture1.ShowBasicTypes();
        System.out.println();

        // H O M E W O R K
        Lecture1.HomeWork();
        System.out.println();
    }

    // L E C T U R E 2,  H O M E W O R K
    
    public static void Lecture2() {
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
    }

    // L E C T U R E 3
    
    public static void Lecture3() {
        System.out.println("---- Lecture 3 ----\n");
        System.out.print(Lecture3.Test1_if());
        System.out.print(Lecture3.Test2_ternary());
        System.out.println();
        Lecture3.Test3();
        System.out.println();
        Lecture3.Test4(1);
        System.out.println();
        Lecture3.Test5();
        System.out.println();
        Lecture3.Test6();
        System.out.println();
    }

    // L E C T U R E 4
    
    public static void Lecture4() {
        System.out.println("---- Lecture 4 ----\n");
    }
}
