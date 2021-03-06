package com.example.AlgorithmProgram;

public class StringPermutationcompute {
    //stringpermute method to check string length and recurive permute method
    public static void stringPermute(String str) {
        if (str == null || str.length() == 0)
            return;
        permute(str.toCharArray(), 0);
    }

    //swap method to interchange the character at pos i and j
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // compute the char permute method
    public static void permute(char array[], int index) {
        if (index == array.length - 1)
            System.out.println(String.valueOf(array));
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            permute(array, index + 1);
            swap(array, index, i);
        }
    }
}
