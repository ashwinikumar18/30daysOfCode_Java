import java.util.*;
public class Product {
   public static int calculateProduct( int a, int b){
     int product = a*b;
     return a*b;
   } 
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("First number is :");
    int a = sc.nextInt();
    System.out.println("Second number is :");
    int b = sc.nextInt();

    int product = calculateProduct(a, b);
    System.out.println("The product of two number is : "+ product); 
   }
}
