package ra.bt5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> texts = new ArrayList<>();
        String[] text = str.split(" ");
        for (String word : text) {
            texts.add(word);
        }
        List<String> shortestStrings = new ArrayList<>();
        int min = texts.get(0).length();
        for (String word : texts) {
            int length = word.length();
            if (length < min) {
                min = length;
                shortestStrings.clear();
                shortestStrings.add(word);
            } else if (length == min) {
                shortestStrings.add(word);
            }
        }
        System.out.println("Các từ ngắn nhất trong câu:");
        for (String word : shortestStrings) {
            System.out.println(word);
        }
    }


}
