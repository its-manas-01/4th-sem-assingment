import java.util.Scanner;
public class Highest_number
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        A ob=new A();
        System.out.println("Enter three numbers:-");
        ob.get(sc.nextInt(),sc.nextInt(),sc.nextInt());
        ob.cal();
        System.out.println("The highest number is:-"+ob.d);
        sc.close();
    }
}
class A
{
    int a,b,c,d;
    void get(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void cal()
    {
        d=a>b?a>c?a:c:b>c?b:c;
    }
}