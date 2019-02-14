package janJavaProgramming.week10.ex1;

public class Pokemon {

    private String name, type1, type2;
    private Integer total, HP, attack, defense, atkSpeed, defSpeed, speed, generation;
    private Boolean legendary;


    public Pokemon(String name, String type1, String type2, Integer total, Integer HP, Integer attack, Integer defense, Integer atkSpeed, Integer defSpeed, Integer speed, Integer generation, Boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.atkSpeed = atkSpeed;
        this.defSpeed = defSpeed;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getAtkSpeed() {
        return atkSpeed;
    }

    public Integer getDefSpeed() {
        return defSpeed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total=" + total +
                ", HP=" + HP +
                ", attack=" + attack +
                ", defense=" + defense +
                ", atkSpeed=" + atkSpeed +
                ", defSpeed=" + defSpeed +
                ", speed=" + speed +
                ", generation=" + generation +
                ", legendary=" + legendary +
                '}';
    }
}