public class Letter_patten_print 
{
    public static void main(String[] args) 
    {
        int k = 0;
        char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
        for (int i = 0; i <a.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(a[k] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
