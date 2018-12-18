package NovJavaProgramming.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {
        Map<Integer, String> index = new HashMap<>();
        System.out.println("index: " + index);
        Integer page1 = 1;
        Integer page2 = 2;
        Integer page3 = 3;

        String topic1 = "Sports";
        String topic2 = "News";
        String topic3 = "Other Stuff";
        String topic4 = "Movies";

        index.put(1, topic1);
        index.put(2, topic2);
        index.put(3, topic3);


        System.out.println("index: " + index);
        System.out.println("index keys: " + index.keySet());
        System.out.println("index values: " + index.values());

        index.put(3, topic4);

        System.out.println("index: " + index);

        if (index.containsKey(1)){
            System.out.println("the page number 1 has as a key");
        }
        System.out.println("the topic of page number 2 is " + index.get(page2));

        Integer indexSize = index.size();
        System.out.println("index size: " + indexSize);



    }
}
