package AutomationBasics;

public class ExceptionExample {
    public static void main(String[] args)
    {
        String b = "$234";
        try {
            int a = 1;
            int c = Integer.parseInt(b);
            System.out.println(a + c);
        }
        catch (NumberFormatException ex){
          String d = b.substring(1);
          int h = Integer.parseInt(d);
          System.out.println(h);
        }

    }
}
