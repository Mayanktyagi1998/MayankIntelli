package AutomationBasics;

public class OverridingExample1 extends OverridingExample2{
    public static void main(String[] args)
    {
     OverridingExample2 over1 = new OverridingExample2();
     over1.met1();
    }
    public void met1()
    {
      System.out.println("1");
    }
}
