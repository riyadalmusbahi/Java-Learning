package decJavaProgramming.week5.ikeaFurniture;

public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobe = (Wardrobe) wardrobeBuilder.build();
        System.out.println("Wardrobe: " + wardrobe);
    }
}
