class z extends Thread {
    public void run()
    {
        try 
        {
            System.out.println("BCA");
            Thread.sleep(5000);
            System.out.println("BBA");
        } 
        catch (Exception e) 
        {
            System.out.println("Exception arise");
        }
    }
}

public class Test_Thread
{
    public static void main(String[] args) 
    {
        z ob = new z();
        ob.start();
    }
}