package NovJavaProgramming.printArticle;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }
}
// doesnt work right with printing the articles in Magazine.
// though the tiltle displays okay.
// # REVISE
