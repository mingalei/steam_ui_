package utils;

import com.github.javafaker.Faker;

public class RandomGeneration {

    public static String getRandomGame() {
        String[] gamesName = {"Half-Life: Alyx", "Way of the Hunter"};
        return new Faker().options().option(gamesName);
    }
}
