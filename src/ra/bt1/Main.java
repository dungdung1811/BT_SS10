package ra.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numberRandom = (int) (Math.random()*100);
            list.add(numberRandom);
        }
        System.out.println(list);
        int max = Collections.max(list);
        System.out.println(max);
    }
}
