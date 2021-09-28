package AlgorithamOfSort;
/* purpose insertion sort to give the word in order list
 * Sting give word and sort the words
 */
public class InsertionSort{
    public static void main(String args[]){
        String[] string = {"hi","hello","how","are","you"};
        InsertionSortCompute insertionSortCompute = new InsertionSortCompute();
        System.out.println("Order of word preiviously the insertion sort");
        for(String i :string){
            System.out.print(i+" ");
        }
        insertionSortCompute.insertionOfNumber(string);
    }
}
