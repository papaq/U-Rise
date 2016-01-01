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
public final class Lecture4 {
    private Lecture4(){
        
    }
    
    public static int Test1SumOfArray(int [] inputArray){
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];            
        }
        return sum;
    }
    
    public static int Test1SumOfArrayRecursive(int [] inputArray){
        if (inputArray.length != 1) {
            return Test1SumOfArrayRecursive(
                    Arrays.copyOfRange(inputArray, 1, inputArray.length)
            ) + inputArray[0];
        }
        return inputArray[0];
    }
    
    // Exponent must be integer number
    public static double Test2ExponentRecursive(double base, int exponent){
        if (exponent < 0){
        return Test2ExponentRecursive(1/base, -exponent-1) / base;
        }
        
        if (exponent == 0) {
            return 1;
        }
        
        return Test2ExponentRecursive(base, exponent-1) * base;
    }
    
    public static int[] Test3FibonacciLoop(int [] results){
        if (results.length > 0) {
            results[0] = 1;
        }
        if (results.length > 1) {
            results[1] = 1;
        }
        if (results.length > 2) {
            for (int i = 2; i < results.length; i++) {
                results[i] = results[i-1] + results[i-2];
            }
        }
        return results;
    }
    
    public static int[] Test3FibonacciRecursive(int [] results, int currentStep){
        switch(currentStep){
            case 0: 
                if (results.length > 0) {
                   results[0] = 1;
                   return Test3FibonacciRecursive(results, 1); 
                }
                break;
            case 1:
                if (results.length > 1) {
                   results[1] = 1;
                   return Test3FibonacciRecursive(results, 2); 
                }
                break;
            default:
                if (results.length > currentStep) {
                   results[currentStep] = results[currentStep-1]+results[currentStep-2];
                   return Test3FibonacciRecursive(results, ++currentStep); 
                }
                break;                
        }
        return results;
    }
}
