import java.util.*;
public class Subarray {
    public static void printSubarrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){ // idx of sub array
            int start = i;
            for(int j=i; j<numbers.length; j++){ // between numbers of subarray
                int end = j; 
                for(int k=start; k<=end; k++){ //print
                    System.out.print(numbers[k]+" "); // subarrays
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
