package NovJavaProgramming.doorOpen;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(107);
        Key key = new Key();
        key.open(door);

    }
}
