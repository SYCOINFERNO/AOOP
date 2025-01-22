// Abstract Enemy class
abstract class Enemy {
    public abstract void attack();
}

// Concrete Enemy classes for different levels
class EasyEnemy extends Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks with basic attack!");
    }
}

class HardEnemy extends Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks with advanced tactics!");
    }
}

// Abstract factory to create enemy
abstract class EnemyFactory {
    public abstract Enemy createEnemy();
}

// Concrete Factory classes for each level
class EasyLevelEnemyFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardLevelEnemyFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}
