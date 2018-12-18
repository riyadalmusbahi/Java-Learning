package NovJavaProgramming.dataStructure.topicsPrinter;
import NovJavaProgramming.dataStructure.printShop.FileReader;
import NovJavaProgramming.dataStructure.bookIndex.Topic;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader reader = new FileReader();

    public List<Topic> getTopics(String filePath){
        List<String> topicsStrings = reader.asLines(filePath);
        List<Topic> topics = new ArrayList<>();

        for (String topicsString : topicsStrings) {
            Topic topic = new Topic(topicsString);
            topics.add(topic);
        }
        return topics;
    }
}
