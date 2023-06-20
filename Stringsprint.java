import java.util.*;
public class Stringsprint {
  public static void main(String args[]){
    String FirstName = "Ashwini";
        String LastName  = "Kumar";
        String FullName  = FirstName + LastName;

        System.out.println(FullName.length());
       
        for(int i=0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
  }
}
