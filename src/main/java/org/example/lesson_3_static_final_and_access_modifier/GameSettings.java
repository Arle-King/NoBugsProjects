package org.example.lesson_3_static_final_and_access_modifier;

public class GameSettings {
    private static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
    }

    public static void setMaxPlayers(int maxPlayersGame) {
        maxPlayers = maxPlayersGame;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Максимальное количество игроков достигнуто");
        }
    }

    public void printGameStatus() {
        System.out.println("Название игры: " + gameName);
        System.out.println("Текущее количество игроков: " + currentPlayers);
        System.out.println("Максимальное количество игроков: " + maxPlayers);
    }
}
