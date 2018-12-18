package decJavaProgramming.week5.ikeaFurniture;

public class AddTop implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Top");
    }
}
