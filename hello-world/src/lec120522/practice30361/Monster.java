package lec120522.practice30361;

public class Monster {
    private String name;
    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
