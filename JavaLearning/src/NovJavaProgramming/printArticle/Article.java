package NovJavaProgramming.printArticle;


class Article
{
    private String title, text;

     public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

     public String getTitle(){
        return title;
    }
     public String getText()    {
        return text;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}