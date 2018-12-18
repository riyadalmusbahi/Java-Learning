package NovJavaProgramming.dataStructure.bookIndex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {

    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index: " + index);

        Integer pageNumber1 = 1;
        Integer pageNumber2 = 2;
        Topic topic1 = new Topic("Art");
        Topic topic2 = new Topic("Music");
        Topic topic3 = new Topic("Instruments");
        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();

        topics1.add(topic1);
        topics2.add(topic2);
        topics2.add(topic3);

        index.put(pageNumber1, topics1);
        index.put(pageNumber2, topics2);

        System.out.println("Index keys: " + index.keySet());
        System.out.println("Index values: " + index.values());


        Topic topic4 = new Topic("Artists");

        List<Topic> stored = new ArrayList<>(index.get(pageNumber1));
        stored.add(topic4);
        System.out.println("Index: " + index);

        if (index.containsKey(pageNumber1)) {
            System.out.println("the page number 1 has as a key");
        }
        List<Topic> stored2 = new ArrayList<>(index.get(pageNumber2));
        stored2.add(topic4);
        System.out.println("topics in page number 2 are : " + stored2);

        Integer size = index.size();
        System.out.println("Index size: " + size);


    }
}
