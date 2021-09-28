package AlgorithamOfSort;
/* purpose check the word present with binary search compute
 * check the word
 */
public class BinarySearchCompute {
    public static void main(String args[]){
        String[] array = {"contribute","geek","ide","practice"};
        for(String i:array){
            System.out.print(i+" ");
        }
        BinarySearchOfWord<String>binarySearchOfWord = new BinarySearchOfWord<String>();
        String index = "ide";
        int result = binarySearchOfWord.binarySearchNumber(array,index);
        if(result == -1){
            System.out.println("word does not present in the compute");
        }
        else{
            System.out.println("\n word the present"+"index"+result);
        }
    }
}
