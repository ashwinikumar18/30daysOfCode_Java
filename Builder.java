import java.util.*;
public class Builder {
   public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Ashwini");
    System.out.println(sb);

    // print a char from a string of any of the index.
    System.out.println(sb.charAt(0));

    //replace char at any of the index.
    sb.setCharAt(4, 'a');
    System.out.println(sb);

    //insert th char in word or string.
    sb.insert(1, 's');
    System.out.println(sb);

    // delete a char from the word or string.
    sb.delete(1, '2');
    System.out.println(sb);
   } 
}
