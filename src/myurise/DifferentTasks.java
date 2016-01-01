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
public final class DifferentTasks {
    
    private DifferentTasks() {
        
    }
    
    // Task 1
    public static String GreetMe(String me) {
        return "Hello, " + me + "!";
    }
    
    // Task 2
    public static boolean CheckIfCharIsDigit(char symbol) {
        return (47 < (int)symbol && (int)symbol < 58);
    }
    
    // Task 3
    public static boolean CheckIfRightTriangle(int a, int b, int c) {
        return (0 == a*a + b*b - c*c 
                || 0 == a*a + c*c - b*b
                || 0 == b*b + c*c - a*a);            
    }
    
    // Task 4
    public static boolean CheckIfIsoscelesTriangle(int a, int b, int c) {
        return ((a == b && c < a + b) 
                || (a == c && b < a + c)
                || (c == b && a < c + b));            
    }
    
    // Task 5
    public static boolean CheckIfBothEquilateralEqualTriangles(
            int a, int b, int c, int d, int e, int f) {
        return (a == b && a == c && a == d && a == e && a == f);
    }
    
    // Task 6
    public static boolean CheckIfFirstIsNxSecond(int x, int y) {
        return (0 == x%y);
    }
    
    // Task 7
    public static boolean CheckIfBothOddOrNot(int x, int y) {
        return (0 == x%2 - y%2);
    }
    
    public static int ReverseA(int a) {
        int b = 0;
        while (a != 0) { 
            b = b*10 + a%10;
            a /= 10;
        }
        return b;
    }
        
    // Task 8
    public static boolean CheckIfSumIsEven(int a) {
        int sum = 0;
        while (a != 0) {            
            sum += a%10;
            a /= 10;
        }
        return 0 == sum%2;
    }
    
    // Task 9
    public static boolean CheckIfPalindrome(int a) {
        return a == ReverseA(a);
    }
    
    // Task 10
    public static boolean CheckIfSumHalf1equalSumHalf2(int a) {
        int b = ReverseA(a);
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += a%10 - b%10;
            a /= 10;
            b /= 10;
        }
        return sum == 0;
    }
    
    // Task 11
    public static boolean CheckIfEachPrevDigitNotLess(int a) {
        int prevDigit = 9;
        while (a > 0) {            
            if (prevDigit < a%10) {
                return false;
            }
            prevDigit = a%10;
            a /= 10;
        }
        return true;
    }
    
    // Task 12
    public static double [] SolveQuadraticEquation(double a, double b, double c) {
        double d = b*b - 4*a*c;
        if (d < 0) {
            return null;
        }
        return new double[] {
            (-b - Math.sqrt(d)) / (2 * a), 
            (-b + Math.sqrt(d)) / (2 * a)};
    }
    
    // Task 13
    public static boolean CheckIfOneIsEven(double [] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (0 == arr[i]%2) {
                return true;
            }
        }
        return false;
    }
    
    // Task 14
    public static boolean CheckIfStringIsNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!CheckIfCharIsDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
}
