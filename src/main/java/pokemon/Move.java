package pokemon;

public class Move {
    private String name;
    private int damage;
    private String moveType;

    public Move(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.moveType = type;
    }

//getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDescription() {
        return moveType;
    }

    public void setDescription(String type) {
        this.moveType = type;
    }
}
