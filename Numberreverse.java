import java.util.*;
public class Numberreverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("The reverse digit is:");
        
        while(n>0){
            int lastDigit = n%10;
            
            System.out.print(lastDigit + " ");
            n = n/10;
    }
    }
}
