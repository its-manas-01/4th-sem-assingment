interface  x{
    static final int a=5;
}
class y
{
    int b=10;
}
class m extends y implements x 
{
    int d;
    void calculate()
    {
        d=(a+b);
        System.out.println(d);
    }
}
public class Interface {
    public static void main(String[] args) {
        m ob =new m();
        ob.calculate();
    }
}
