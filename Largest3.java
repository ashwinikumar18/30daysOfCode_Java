import java.util.*;
public class Largest3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value:");
        int a=sc.nextInt();
        System.out.println("Enter the value:");
        int b=sc.nextInt();
        System.out.println("Enter the value:");
        int c=sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("Largest is a");
        }
        else if(b>=c){
            System.out.println("Largest is b");
        } 
        else{
            System.out.println("Largest is c");
        }   
    }
    
}
