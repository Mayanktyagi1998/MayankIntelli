package AutomationBasics;

public class OverloadingExample {
    public static void main(String[] args)
    {
        OverloadingExample obj = new OverloadingExample();
        obj.method1(2);
        obj.method1("Mayank");
        obj.method1("Tyagi",4);
    }
    public void method1(int a)
    {
        System.out.println(a);
    }

    public void method1(String b)
    {
        System.out.println(b);
    }
    public void method1(String b,int a)
    {
        System.out.println(b);
        System.out.println(a);
    }
}
