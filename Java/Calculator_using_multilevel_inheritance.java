import java.util.*;
class add
{
    int add(int x, int y)
    {
        return x+y;
    }
}
class sub extends add
{
    int sub(int x, int y)
    {
        return x-y;
    }
}
class multi extends sub
{
    int multi(int x, int y)
    {
        return x*y;
    }
}
class div extends multi
{
    int div(int x, int y)   
    {
        return x/y;
    }
}
class cal extends div
{
    int a,b,choice;
    void input(int x)
    {
        choice = x;
    }
    void input(int x, int y)
    {
        a=x;
        b=y;
    }
    void output()
    {
        switch(choice)
        {
            case 1:
                System.out.println("Addition of two numbers is "+add(a,b));
                break;
            case 2:
                System.out.println("Subtraction of two numbers is "+sub(a,b));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is "+multi(a,b));
                break;
            case 4:
                System.out.println("Division of two numbers is "+div(a,b));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
public class Calculator_using_multilevel_inheritance 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cal ob =new cal();
        System.out.println("1 .Addition\n2 .Subtraction\n3 .Multiplication\n4 .Division\n");
        ob.input(scanner.nextInt());
        System.out.println("Enter two numbers");
        ob.input(scanner.nextInt(), scanner.nextInt());
        ob.output();
        scanner.close();
    }
}
