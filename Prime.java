import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int div=2;

        if( n%2 == 0){
            System.out.println("It is a non-prime number.");
        }
        else{
            System.out.println("It is a prime number.");
        }
    }
}
