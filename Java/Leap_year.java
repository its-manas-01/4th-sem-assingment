import java.util.*;
class  input
{
    int x;
    void get(int a)
    {
        x=a;
    }   
}
class output extends input
{
    void cal()
    {
        if(x%400==0&&x%4==0)
    {
        System.out.println("leap year");
    }
    else
    {
        System.out.println("not a leap year");
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
        ob.get(scanner.nextInt());
        ob.cal();
        scanner.close(); 
    } 
}
