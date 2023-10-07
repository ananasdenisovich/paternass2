package src;
public class CharacterComponent {
    private String name;
    private int health;
    private int strength;
    private int agility;

    public CharacterComponent(String name, int health, int strength, int agility) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
    }

    public void displayStats() {
        System.out.println("Name: " + name + ", Health: " + health + ", Strength: " + strength + ", Agility: " + agility);
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
