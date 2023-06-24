import java.util.*;
public class Operator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" the value A is greater or not.");
        int a,b;
        System.out.println("Enter the number in (a):");
        a=sc.nextInt();
        System.out.println("Enter the number in (b):");
        b=sc.nextInt();
        if( a > b && a >= b){
            System.out.println("->>Yes it is greater.");
        }
        else{
            System.out.println("->>No it is not greater.");
        }

    }
}
