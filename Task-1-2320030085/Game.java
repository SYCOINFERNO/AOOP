public class Game {
    private GameState gameState;
    private EnemyFactory enemyFactory;
    private ItemFactory itemFactory;

    public Game() {
        this.gameState = GameState.getInstance();
    }

    public void startGame() {
        while (!gameState.isGameOver()) {
            // Select enemy and item factory based on level
            if (gameState.getCurrentLevel() <= 3) {
                enemyFactory = new EasyLevelEnemyFactory();
                itemFactory = new EasyLevelItemFactory();
            } else {
                enemyFactory = new HardLevelEnemyFactory();
                itemFactory = new HardLevelItemFactory();
            }

            // Create enemy and item
            Enemy enemy = enemyFactory.createEnemy();
            Weapon weapon = itemFactory.createWeapon();
            PowerUp powerUp = itemFactory.createPowerUp();

            // Game logic (combat, item usage, etc.)
            System.out.println("Level: " + gameState.getCurrentLevel());
            enemy.attack();
            weapon.use();
            powerUp.applyEffect();

            // Increase level, add points, check if game is over
            gameState.setCurrentLevel(gameState.getCurrentLevel() + 1);
            gameState.addScore(100);

            if (gameState.getCurrentLevel() > 5) {
                gameState.setGameOver(true);
                System.out.println("Game Over! Final Score: " + gameState.getScore());
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
