package NovJavaProgramming.dataStructure.printShop;

public class LoremIpsumApplication {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        System.out.println("The Book is: " + fileReader.asLines("NovJavaProgramming/dataStructure/printShop/lorem-ipsum.txt"));

    }
}
