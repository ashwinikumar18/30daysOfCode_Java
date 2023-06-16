import java.util.*;
public class CalculateSum{
public static int calculatorSum(int a, int b){
    int sum = a + b;
    return sum;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("First number is :");
    int a = sc.nextInt();
   
    System.out.println("Second number is :");
     int b = sc.nextInt();
    
    int sum = calculatorSum(a, b);
    System.out.println("Sum of two number is :"+ sum);
}
}