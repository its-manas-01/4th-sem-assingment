import java.util.Scanner;

public class String_Palindrom 
{
    public static String reverse(String str) 
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String str1 = reverse(str);
        if(str.equals(str1))
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
}
