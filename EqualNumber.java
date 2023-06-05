import java.util.*;
public class As8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        if(p==q)
        {
            System.out.println("Equal");
        }else{
            if(p>q)
            {
                System.out.println("p is greater than q");
            }else{
                System.out.println("p is lesser than q");
            }
        }
       
    }
    
}

