import java.util.*;
class  input
{
    int x;
    void get(int a)
    {
        x=a;
    }   
}
class calc extends input
{
    boolean flag = false;
    void cal(int a)
    {
        get(a);
        if ((x % 400 == 0 && x % 4 == 0) || (x % 4 == 0 && x % 100 != 0))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
    }
}
class output extends calc
{
    void display(int a)
    {
        cal(a);
        if (flag == true)
        {
            System.out.println(x + " is a leap year");
        }
        else
        {
            System.out.println(x + " is not a leap year");
        }
    }
}
public class Leap_year 
{
    public static void main(String[] args) 
    {
        output ob =new output();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        ob.display(scanner.nextInt());
        scanner.close(); 
    } 
}
