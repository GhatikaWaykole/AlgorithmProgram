package com.example.AlgorithmProgram;

import java.util.Scanner;

/* purpose check string permutation use recursion method
* string will be take as char array and interchange the char to find all permutation of string
 */
public class AlgorithmProgram {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to algorthm permutation program");
        //object of stringpermute to compute the permutation
    //    StringPermutationcompute a = new StringPermutationcompute();
        //object to compute prime number in the range give
        primeNumber prime = new primeNumber();
  /*      String str = "ABC";
        a.stringPermute(str);       */
        System.out.println("Enter the min and max number to compute the prime");
        prime.checkPrime(scanner.nextInt(),scanner.nextInt());
    }

    }
