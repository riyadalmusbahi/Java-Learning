package NovJavaProgramming.printArticle;

public class Editor {

    public Magazine writeMagazine(){
        Magazine magazine = new Magazine("NY Times");
        magazine.add(new Article("Sports ", "All teams lost"));
        magazine.add(new Article("Weather ", "Cold as polar bear"));
        magazine.add(new Article("LifeStyle ", "Don't get me started on that"));
        return magazine;


    }
}
