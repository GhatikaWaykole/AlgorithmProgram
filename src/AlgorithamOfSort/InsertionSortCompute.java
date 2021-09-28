package AlgorithamOfSort;
 /* 0   1     2    3    4
  * hi hello how  are  you
  *     i
  *  j
  *  key = hello
  */
public class InsertionSortCompute<E extends Comparable<E>>{
    public void insertionOfNumber(E[] array){            //compute the i element to j element whenever j >0 larger than the key value
        int length= array.length;
        for(int i=1;i<length;i++){
            E key = array[i];
            int j = i-1;
            while(j>=0 && (array[j].compareTo(key))>0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        arraySortDisplay(array);
    }
    public void arraySortDisplay(E[] array){
        System.out.println("\n words after insertion sort"); //print the word after insertion sort compute
        for(E i:array){
            System.out.print(i+" ");
        }
    }
}
