package com.example.AlgorithmProgram;

public class primeNumber {
    //method checkPrime to compute the prime number
    public static void checkPrime(int min,int max){
        System.out.println("prime number");
        for(int i=min;i<max;i++){
            //prime(i);
            if(prime(i)) {                 //recursive method to check prime compute
                System.out.println(i);
            }
        }
    }
    // method to check the prime number
    public static boolean prime(int num){
        for(int i=2;i<=num/2;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
}
