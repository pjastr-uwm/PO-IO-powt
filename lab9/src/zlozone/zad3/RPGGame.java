package zlozone.zad3;

import java.util.Objects;

public class RPGGame extends ComputerGame{

    private String gameWorld;

    public RPGGame(String title, String producer, double[] ratings, String gameWorld) {
        super(title, producer, ratings);
        this.gameWorld = gameWorld;
    }

    public String getGameWorld() {
        return gameWorld;
    }

    public void setGameWorld(String gameWorld) {
        this.gameWorld = gameWorld;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", gameWorld='" + gameWorld ;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        RPGGame rpgGame = (RPGGame) o;

        return Objects.equals(gameWorld, rpgGame.gameWorld);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (gameWorld != null ? gameWorld.hashCode() : 0);
        return result;
    }
}
