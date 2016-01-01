/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myurise;

import java.util.Arrays;

/**
 *
 * @author yural
 */
public final class ExecuteLectures {

    private ExecuteLectures() {

    }

    private static void PrintLectureTitle(int lectureNumber) {
        System.out.println("---- Lecture " + lectureNumber + " ----\n");
    }
    
    private static void PrintTaskTitle(String taskNumber) {
        System.out.println("\nTask №" + taskNumber);
    }
    
    private static void PrintTaskTitle(int taskNumber) {
        System.out.println("\nTask №" + taskNumber);
    }
    
    // L E C T U R E 1
    
    public static void Lecture1() {
        // C L A S S W O R K
        PrintLectureTitle(1);
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
        PrintLectureTitle(2);
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
        PrintLectureTitle(3);
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
        PrintLectureTitle(4);
        int[] intArr = {1, 2, 3, 4, 5, 6};
        System.out.format(
                "Sum of elements in array\n%1$s\nis equal to:\n"
                        + "     Loop\n%2$d\n"
                        + "     Recursion\n%3$d\n\n", 
                Arrays.toString(intArr), 
                Lecture4.Test1SumOfArray(intArr),
                Lecture4.Test1SumOfArrayRecursive(intArr)
        );
        
        double base = 2;
        int exponent = 32;
        System.out.format("%1$.2f raised to the power of %2$d", base, exponent);
        System.out.format(" is %1$.6f\n\n", 
                Lecture4.Test2ExponentRecursive(base, exponent)
        );
        
        int arrayOfFibonacci [] = new int[13];
        System.out.format(
                "Fibonacci sequence is:\n     Loop\n%1$s\n",
                Arrays.toString(Lecture4.Test3FibonacciLoop(arrayOfFibonacci)));
        arrayOfFibonacci = new int[13];
        System.out.println("     Recursion\n" + Arrays.toString(
                Lecture4.Test3FibonacciRecursive(arrayOfFibonacci, 0)) + "\n"
        );
    }
    
    public static void DiffTasksP1(){
        PrintTaskTitle(1);
        System.out.println(DifferentTasks.GreetMe("Jamal"));
        
        PrintTaskTitle(2);
        System.out.println("'5' is " 
                + (DifferentTasks.CheckIfCharIsDigit('5') 
                        ? "a digit"
                        : "not a digit")
        );
        
        PrintTaskTitle(3);        
        int a = 5;
        int b = 13;
        int c = 12;
        System.out.println("Triangle with sides:"
                + "\na = " + a
                + "\nb = " + b
                + "\nc = " + c
                + "\nis " 
                + (DifferentTasks.CheckIfRightTriangle(a, b, c) 
                        ? "right"
                        : "not right")
        );
        
        PrintTaskTitle(4);
        System.out.println("Triangle with sides:"
                + "\na = " + a
                + "\nb = " + b
                + "\nc = " + c
                + "\nis " 
                + (DifferentTasks.CheckIfIsoscelesTriangle(a, b, c) 
                        ? "isosceles"
                        : "not isosceles")
        );
        
        PrintTaskTitle(5);
        System.out.println("Triangles with sides:"
                + "\na = " + a
                + "\nb = " + b
                + "\nc = " + a
                + "\nd = " + a
                + "\ne = " + a
                + "\nf = " + a
                + "\nare " 
                + (DifferentTasks.CheckIfBothEquilateralEqualTriangles(
                        a, b, a, a, a, a) 
                        ? "equal and equilateral"
                        : "not equal and equilateral")
        );
        
        PrintTaskTitle(6);
        System.out.println(c + " divided by " + a
                + (DifferentTasks.CheckIfFirstIsNxSecond(c, a)
                        ? " leaves NO remainder"
                        : " leaves a remainder")
        );
        
        PrintTaskTitle(7);
        System.out.println(a + " and " + b + " are "
                + (DifferentTasks.CheckIfBothOddOrNot(a, b)
                        ? "both even or uneven"
                        : "not both even or uneven")
        );
        
        int revA = 12345;
        PrintTaskTitle("8.0");
        System.out.println("Reversed " + revA + " is "
                + DifferentTasks.ReverseA(revA)
        );
        
        int numN = 547680;
        PrintTaskTitle(8);
        System.out.println("Sum of digits in " + numN + " is "
                + (DifferentTasks.CheckIfSumIsEven(numN)
                        ? "even"
                        : "uneven")
        );
        
        int numPalindrome = 1578751;
        PrintTaskTitle(9);
        System.out.println("Number " + numPalindrome + " is "
                + (DifferentTasks.CheckIfPalindrome(numPalindrome)
                        ? "a palindrome"
                        : "not a palindrome")
        );
        
        int numSumParts = 5142;
        PrintTaskTitle(10);
        System.out.println("Sums of first and last two digits of " 
                + numSumParts + " are "
                + (DifferentTasks.CheckIfSumHalf1equalSumHalf2(numSumParts)
                        ? "equal"
                        : "not equal")
        );
        
        int numPrevNotLess = 112556;
        PrintTaskTitle(11);
        System.out.println("In number " 
                + numPrevNotLess + " previous digits are "
                + (DifferentTasks.CheckIfEachPrevDigitNotLess(numPrevNotLess)
                        ? "not less than next"
                        : "random")
        );
        
        int kA = 19;
        int kB = 19; // 38
        int kC = -38; // -57
        PrintTaskTitle(12);
        double solution[] = DifferentTasks.SolveQuadraticEquation(kA, kB, kC);
        System.out.println("Quadratic equation with coefficients:" 
                + "\na = " + kA
                + "\nb = " + kB
                + "\nc = " + kC
                + (solution != null
                ? "\nhas such roots:"
                        + "\nx1 = " + solution[0]
                        + "\nx2 = " + solution[1]
                : "\nhas no roots")
        );
                
        PrintTaskTitle(13);
        
        System.out.println(
                (DifferentTasks.CheckIfOneIsEven(solution)
                    ? "At least one of the roots above is even"
                    : "No root is even")
        );
        
        PrintTaskTitle(14);
        String str = "556l84";
        System.out.println(
                "The string \""
                + str
                + (DifferentTasks.CheckIfStringIsNumber(str)
                    ? "\" is a number"
                    : "\" is not a number")
        );
    }
    
    public static void Lecture5() {
        PrintLectureTitle(5);
    }
    
    
}
