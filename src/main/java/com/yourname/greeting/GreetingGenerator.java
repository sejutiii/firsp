package com.yourname.greeting;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

public class GreetingGenerator {

    private static final String[] GREETINGS = {
        "Hello", "Hi", "Welcome", "Greetings", "Hey there"
    };

    private static final String[] EMOJIS = {
        "😊", "👋", "🎉", "🙌", "👍"
    };

      private static Random random = new Random();

    public static String generateGreeting(String name) {
        String greeting = GREETINGS[random.nextInt(GREETINGS.length)];
        String emoji = EMOJIS[random.nextInt(EMOJIS.length)];
        String capitalized = StringUtils.capitalize(name); // Using the added JAR
        return greeting+ " " + capitalized + "! " + emoji;
    }
}