package decJavaProgramming.week5.ikeaFurniture;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Shelf");
    }
}
