package NovJavaProgramming.printArticle;

public class PrinterApplication {
    public static void main(String[] args) {

        Article article = new Article("At What Temperature Does Gasoline Freeze ?","We can understand better the exact answer to the question “At what temperature does gasoline freeze?” by identifying the elements that compose gasoline.\n" +
                "\n" +
                "First off, gasoline is not a plain substance. It is not pure at all. Instead, it is a mixture of various hydrocarbons and additives – hundreds in quantity. Common ones are ethanol, toluene, octane, hexane, and heptane. On the reflection hand, optional ones are butane and pentane." );

        Printer printer = new Printer();
        printer.print(article);
    }


}
