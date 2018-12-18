package decJavaProgramming.week5.ikeaFurniture;

public class AddBack implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Back");
    }



}
