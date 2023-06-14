import java.util.*;
public class Linearsearch {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
          //Input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        //Output
          for(int i=0; i<numbers.length; i++){
            if(numbers[i] == X){
            System.out.println("X found at index : " + i);
            }
          }  
    }      
}

