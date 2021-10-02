package AlgorithamOfSort;
/* create merge method to sort the array data
 * display the data
 */
public class MergeSortCompute {
    public static void main(String args[]){
        int[] array = {5,4,3,2,1};
        MergeSort merge = new MergeSort();           //create object data
        System.out.println("initial array");
        merge.display(array);                       //display the array data
       array =  merge.mergeSort(array);
        System.out.println("merge sort array");
        merge.display(array);
    }
}
