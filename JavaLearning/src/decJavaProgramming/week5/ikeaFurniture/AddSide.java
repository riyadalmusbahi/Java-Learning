package decJavaProgramming.week5.ikeaFurniture;

public class AddSide implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Side");
    }
}
