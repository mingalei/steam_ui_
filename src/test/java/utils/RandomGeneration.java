package utils;

import com.github.javafaker.Faker;

public class RandomGeneration {

    public static String getRandomGame() {
        String[] gamesName = {"Half-Life: Alyx", "The Binding of Isaac: Rebirth"};
        return new Faker().options().option(gamesName);
    }
}
