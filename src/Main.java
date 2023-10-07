package src;

public class Main {
    public static void main(String[] args) {
        CharacterComponent magician = new Wizard("Magician", 100, 50, 30);
        magician.displayStats();
        CharacterDecorator weaponUpgrade = new WeaponUpgradeDecorator(magician);
        CharacterDecorator armorUpgrade = new ArmorUpgradeDecorator(magician);
        weaponUpgrade.upgrade();
        armorUpgrade.upgrade();
        magician.displayStats();
    }
}
