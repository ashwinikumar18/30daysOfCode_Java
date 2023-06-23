import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class Butterfly {
    public static void main(String args[]){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


            //Lower Half
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
            }
            // 2nd part
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}
