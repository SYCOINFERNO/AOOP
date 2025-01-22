public class GameState {
    private static GameState instance;
    private int currentLevel;
    private int score;
    private boolean isGameOver;

    // Private constructor to prevent instantiation
    private GameState() {
        this.currentLevel = 1;
        this.score = 0;
        this.isGameOver = false;
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Getters and setters for game state
    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }
}
