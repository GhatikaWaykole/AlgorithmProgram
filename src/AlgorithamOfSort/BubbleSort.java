package AlgorithamOfSort;
/* purpose bubble sort compute
 * numbers are sort with bubble sort algorithm
*/
public class BubbleSort {
    public static void main(String args[]){
        System.out.println("number previous to the bubble sort compute");
        int[] numbers = {2,5,8,9,7,4};
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        BubbleSortCompute bubbleSortCompute = new BubbleSortCompute();
        bubbleSortCompute.bubbleSortOfNumber(numbers);
        bubbleSortCompute.arrayDisplay(numbers);
    }
}
