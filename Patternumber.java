import java.util.*;
public class Patternumber {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }
}
