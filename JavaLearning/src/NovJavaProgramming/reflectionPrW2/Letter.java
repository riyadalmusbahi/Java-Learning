package NovJavaProgramming.reflectionPrW2;


public class Letter {

    private String address;
    private Boolean stamped = false;

    public Letter(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Boolean isStamped() {
        return this.stamped;
    }

    public void Stamped(Boolean stamped) {
        this.stamped = true;
    }
}



