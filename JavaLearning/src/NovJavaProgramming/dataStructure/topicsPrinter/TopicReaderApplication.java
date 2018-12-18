package NovJavaProgramming.dataStructure.topicsPrinter;

import NovJavaProgramming.dataStructure.bookIndex.Topic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {
    public static void main(String[] args) {
        TopicReader topicReader = new TopicReader();
        List<Topic> listTopics = topicReader.getTopics("NovJavaProgramming/dataStructure/topicsPrinter/topics.txt");

        System.out.println("The topic List: " + listTopics);
        Set<Topic> setTopics = new HashSet<>();
        for (Topic listTopic : listTopics) {
            setTopics.add(listTopic);
        }

        System.out.println("The topic set: " + setTopics);
    }
}
