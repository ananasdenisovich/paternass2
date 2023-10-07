package src;

public class WeaponUpgradeDecorator implements CharacterDecorator {
    private CharacterComponent character;

    public WeaponUpgradeDecorator(CharacterComponent character) {
        this.character = character;
    }

    @Override
    public void upgrade() {
        System.out.println(character.getName() + ": weapon upgrade!");
        int newStrength = character.getStrength() + 50;
        character.setStrength(newStrength);
    }

    public void displayStats() {
        character.displayStats();
    }

    public String getName() {
        return character.getName();
    }
}
