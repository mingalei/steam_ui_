package data;

import com.github.javafaker.Faker;

public class TestData {
    public String setGame = getRandomGame();

    public static String getRandomGame() { //генерация рандомной игры из списка
        String[] gamesName = {"Half-Life: Alyx", "Way of the Hunter", "The Jackbox Party Pack 3"};
        return new Faker().options().option(gamesName);
    }
}
