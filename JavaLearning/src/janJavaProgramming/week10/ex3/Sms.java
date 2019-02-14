package janJavaProgramming.week10.ex3;


public class Sms {

    private String text;
    private String type;



    public Sms(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}
