import java.util.*;
public class Loop {
    public static void printFactorial( int n){
        if(n<0){
            System.out.println("Invaild Number");
        }
        int factorial = 1;
        for( int i=n; i>=1; i--){
            factorial =  factorial * i ;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number :");
        int n = sc.nextInt();
        
        System.out.println("The value is=" );
        printFactorial(n);
        
    }
}
