import java.util.*;
public class Arrays {
    public static void main(String args[]){
       int[] marks = new int[3];
       //int marks[] = new int[3];

       marks[0] =  95; //english
       marks[1] =  97; //phy
       marks[2] =  98; //che
       
      for(int i=0; i<3; i++){
        System.out.println(marks[i]);
      }
    }
}