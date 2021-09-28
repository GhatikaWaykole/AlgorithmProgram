package AlgorithamOfSort;
/* binary search method to check word is present in the give data
 * key is check the word in the given compute
 */
public class BinarySearchOfWord<E extends Comparable<E>>{
    public int binarySearchNumber(E[] array,E x){      //create method binarySearchOfNumber give array and the key to check the word
        int i=0;
        int length = array.length;
        while(i<length){
            int m = i+(length-i)/2;                    //compute the value and give index word data
            int res = x.compareTo(array[m]);
            if(res == 0){                              //method to compare the index and the value
                return m;
            }
            if(res >0){
                i = m+1;
            }
            else{
                length = m-1;
            }
        }
        return  -1;
    }
}
