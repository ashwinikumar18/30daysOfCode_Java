import java.util.*;
public class Substring {
       // Substring(begining, ending); means == it will cut the word form the sentence and print.
    public static void main(String args[]){
        String sentence = "My name is Ashwini";
        String name     = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
