package ra.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String input = "Rekkei Academy để nông dân biết code";
        String [] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 3){
                list.add(arr[i]);
            }

        }
        System.out.println("Lít " +list);
    }
}
