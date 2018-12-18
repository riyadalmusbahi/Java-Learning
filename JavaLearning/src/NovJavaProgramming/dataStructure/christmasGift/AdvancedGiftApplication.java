package NovJavaProgramming.dataStructure.christmasGift;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {


        Optional<Box> giftBox = Optional.empty();
        System.out.println(giftBox);
        Box box = new Box("Christmas gift");
        giftBox = Optional.of(box);
        System.out.println("Gift Box: " + giftBox);

        if (giftBox.isPresent()){
            System.out.println("there is a present in the gift box");
        }

        System.out.println("the gift is a: " + giftBox.get());


    }


        }