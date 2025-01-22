// Abstract Weapon class
abstract class Weapon {
    public abstract void use();
}

// Concrete Weapon classes
class Sword extends Weapon {
    public void use() {
        System.out.println("Using Sword!");
    }
}

class Gun extends Weapon {
    public void use() {
        System.out.println("Using Gun!");
    }
}

// Abstract PowerUp class
abstract class PowerUp {
    public abstract void applyEffect();
}

// Concrete PowerUp classes
class Shield extends PowerUp {
    public void applyEffect() {
        System.out.println("Shield activated!");
    }
}

class SpeedBoost extends PowerUp {
    public void applyEffect() {
        System.out.println("Speed Boost activated!");
    }
}

// Abstract Factory for Weapons and PowerUps
abstract class ItemFactory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();
}

// Concrete Factory classes for different levels/difficulty
class EasyLevelItemFactory extends ItemFactory {
    public Weapon createWeapon() {
        return new Sword(); // Simple weapon for easy level
    }

    public PowerUp createPowerUp() {
        return new Shield(); // Simple power-up for easy level
    }
}

class HardLevelItemFactory extends ItemFactory {
    public Weapon createWeapon() {
        return new Gun(); // Advanced weapon for hard level
    }

    public PowerUp createPowerUp() {
        return new SpeedBoost(); // More advanced power-up for hard level
    }
}
