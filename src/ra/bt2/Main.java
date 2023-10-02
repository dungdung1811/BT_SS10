package ra.bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();

       list1.add(3);
       list1.add(2);
       list1.add(7);
       list1.add(4);
       list1.add(5);
       list1.add(0);
       list1.add(7);
       list1.add(8);
       list1.add(9);
       list1.add(10);
       System.out.println(list1);

        for (int i = list1.size() -1; i >= 0 ; i--) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
    }
}
