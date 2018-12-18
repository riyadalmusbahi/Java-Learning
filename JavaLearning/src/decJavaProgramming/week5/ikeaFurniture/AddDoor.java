package decJavaProgramming.week5.ikeaFurniture;

public class AddDoor implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Door");
    }
}
