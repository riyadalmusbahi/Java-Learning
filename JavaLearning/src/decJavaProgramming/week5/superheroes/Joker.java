package decJavaProgramming.week5.superheroes;

public class Joker implements Villain{


    private Integer lives = 10;



    @Override
    public void weaken(String name) {
        System.out.println("Joker: damn you " + name + " you managed to weaken me! " );
        lives --;
        if (lives == 0) {
            System.out.println("Joker: you all defeated me but i will be back and i will bring my brother");
        }
    }

    @Override
    public String toString() {
        return "Joker{" +
                "lives=" + lives +
                '}';
    }
}
