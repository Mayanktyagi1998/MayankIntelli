package AutomationBasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(34);
        l.add(23);
        System.out.println(l.get(1));
        System.out.println(l.get(0));

        List<String> m = new ArrayList<String>();
        m.add("Rahul");
        System.out.println(m);

    }
}
