package main.java.controller;

import java.util.Locale;

/**
 * Created by Yuliia Borovets on 2020-02-21
 * Locale selection
 *
 * @author Yuliia Borovets
 * @version 1.0
 */
public enum Language {

    UKRAINIAN_LANG("Щоб вибрати українську мову, написніть \"1\". "),
    ENGLISH_LANG("To select English, enter \"2\". ");

    private String usersPrompt;

    Language(String userPrompt) {
        this.usersPrompt = userPrompt;
    }

    public String getUserPrompt() {
        return usersPrompt;
    }

    /**
     * determinate locale define depending on user input.
     * default language - english
     */
    public static Locale determineLocale(Language lang) {
        if (lang == Language.UKRAINIAN_LANG) {
            return new Locale("ua", "UA");
        }
        return new Locale("en", "US");
    }
}
