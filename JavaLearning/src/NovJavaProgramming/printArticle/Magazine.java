package NovJavaProgramming.printArticle;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String title;
    private List<Article> magazineArticles = new ArrayList<>();

    public Magazine(String title) {
        this.title = title;
    }

    public void add(Article article){
        magazineArticles.add(article);
    }

    public String getTitle() {
        return title;
    }

    public List<Article> getMagazineArticles() {
        return magazineArticles;
    }
}
