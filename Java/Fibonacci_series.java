import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n=scanner.nextInt();
        int a=0,b=1,c=0;
        if(n==0)
        {
            System.out.println("The value of fibonacci series "+n+" position is:-"+a);
        }
        else if(n==1)
        {
            System.out.println("The value of fibonacci series "+n+" position is:-"+b);
        }
        else
        {
            for (int i=0;i<=n-2;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println("The value of fibonacci series "+n+" position is:-"+c);
        }
        
        scanner.close();
    }
}
