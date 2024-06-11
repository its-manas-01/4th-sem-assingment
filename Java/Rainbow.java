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
                System.out.println(a[0]);
                break;
            case 2:
                System.out.println(a[1]);
                break;
            case 3:
                System.out.println(a[2]);
                break;
            case 4:
                System.out.println(a[3]);
                break;
            case 5:
                System.out.println(a[4]);
                break;
            case 6:
                System.out.println(a[5]);
                break;
            case 7:
                System.out.println(a[6]);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
