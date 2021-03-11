package com.yuwa.classes;
import java.lang.*;
public class Fibonacci {
    public int fibonacci(int number){

        if ((number == 0) || (number == 1)){
            return 1;
        }
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public void printFibonacci(int number){

        for(int i = 0; i <= number; i ++){
            System.out.printf("Fibonacci of %d is : %d\n", number, fibonacci(number));

        }
    }
}
