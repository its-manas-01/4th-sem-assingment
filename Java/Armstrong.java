import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num = scanner.nextInt();
        int original = num;
        int sum = 0,rem;
        while (num!=0)
        {
            rem = num % 10;
            num = num / 10;
            sum = sum + (int)(Math.pow(rem,3));
        }
        if(sum==original)
        {
            System.out.println(original+"is armstrong number.");
        }
        else
        {
            System.out.println(original+"is not armstrong number.");
        }
        scanner.close();    
    }
}
