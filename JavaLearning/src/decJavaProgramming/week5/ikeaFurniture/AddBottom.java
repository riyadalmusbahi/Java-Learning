package decJavaProgramming.week5.ikeaFurniture;

public class AddBottom implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Bottom");
    }
}
