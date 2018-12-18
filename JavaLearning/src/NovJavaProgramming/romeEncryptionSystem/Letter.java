package NovJavaProgramming.romeEncryptionSystem;

public class Letter {
    private String name;
    private Integer position;

    public Letter(String name, Integer position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }
}
