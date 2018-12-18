package NovJavaProgramming.dataStructure;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println("Gifts: " + giftBox);
        giftBox = Optional.of("RoboToy");
        System.out.println("Gifts: " + giftBox);

        if (giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }

        System.out.println("the gift is a " + giftBox.get());

    }
}
