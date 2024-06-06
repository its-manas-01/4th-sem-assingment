import java.util.Scanner;
public class Rainbow 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] a=new String[]{"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};   
        System.out.println("1."+a[0]+"\n2."+a[1]+"\n3."+a[2]+"\n4."+a[3]+"\n5."+a[4]+"\n6."+a[5]+"\n7."+a[6]);
        System.out.println("Enter your choice:-");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Violet");
                break;
            case 2:
                System.out.println("Indigo");
                break;
            case 3:
                System.out.println("Blue");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Yellow");
                break;
            case 6:
                System.out.println("Orange");
                break;
            case 7:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
