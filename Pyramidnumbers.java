import java.util.*;
public class Pyramidnumbers {
    public static void main(String args[]){
        int n=5;
        //loop for rows
        for(int i=1; i<=n; i++){

            //loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //loop for print numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
