package AlgorithamOfSort;
/* purpose sort the array use merge sort alogrithm
 * create a method and use recursive to sort the array data
 */
public class MergeSort {
    /* method to display the array data
     * @param array return array data
     */
    public static void display(int[] array){
        for(int a:array){
            System.out.println(a+" ");
        }
    }
    /* method to split the data in left and right array
     * @param array return sorted array data
     */
    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }
        int midPoint = array.length/2;
        int[] left = new int[midPoint];
        int[] right;
        if(array.length %2 ==0){
            right = new int[midPoint];
        }
        else{
            right = new int[midPoint+1];
        }
        for(int i=0;i<midPoint;i++){
            left[i] = array[i];
        }
        for(int j=0;j<right.length;j++){
            right[j] = array[midPoint+j];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        int[] result = merge(left,right);
        return result;
    }
    //method to compare the left and right array data and sort the array data
    private static int[] merge(int[] left,int[]right){
        int[] result = new int[left.length+right.length];
        int leftPointer,rightPointer,resultPointer;
        leftPointer = rightPointer = resultPointer =0;
        while(leftPointer <left.length || rightPointer<right.length){
            if(leftPointer < left.length && resultPointer < right.length){
                if(left[leftPointer] < right[rightPointer]){
                    result[resultPointer++] = left[leftPointer++];
                }
                else{
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            else if(leftPointer < left.length){
                result[resultPointer++] = left[leftPointer++];
            }
            else if(rightPointer < right.length){
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
