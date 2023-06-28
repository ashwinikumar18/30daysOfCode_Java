import java.util.*;
public class Switches {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to order:");
        int num=sc.nextInt();
        switch(num){
            case 1 : System.out.println("Pizza");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Chicken");
            break;
            case 4 : System.out.println("Ice-cream");
            break;
            case 5 : System.out.println("Cold-drink");
            break;
            case 6 : System.out.println("Not applicable");
        }
    }
}
