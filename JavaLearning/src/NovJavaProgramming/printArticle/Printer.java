package NovJavaProgramming.printArticle;

public class Printer {

    public void print(Article article){
        System.out.println("Article title : " + article.getTitle());
        System.out.println("Article text : " + article.getText());
    }

    public void printMagazine(Magazine magazine){
        System.out.println("the title of the Magazine is : " + magazine.getTitle());
        System.out.println("here are the articles : " + magazine.getMagazineArticles());
    }

}
