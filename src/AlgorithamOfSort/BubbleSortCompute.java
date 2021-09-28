package AlgorithamOfSort;
/* 0  1  2  3  4  5
 * 2  5  8  9  7  4
 * i
 * j
 */
public class BubbleSortCompute {
    public void bubbleSortOfNumber(int[] array) {             //create buubleSortOfNumber method to give the number
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                   int temp = array[j+1];                   //change the data whenever j > j+1 the value
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public void arrayDisplay(int[] array){
        System.out.println("\n number after bubble sort compute");
        for(int i=0;i<array.length;i++){                  //display the sort values
            System.out.print(array[i]+" ");
        }
    }
}
