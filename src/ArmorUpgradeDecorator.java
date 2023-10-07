package src;

public class ArmorUpgradeDecorator implements CharacterDecorator {
    private CharacterComponent character;

    public ArmorUpgradeDecorator(CharacterComponent character) {
        this.character = character;
    }

    @Override
    public void upgrade() {
        System.out.println(character.getName() + ": armor upgrade!");
        int newAgility = character.getAgility() + 20;
        character.setAgility(newAgility);
    }

    public void displayStats() {
        character.displayStats();
    }

    public String getName() {
        return character.getName();
    }
}
