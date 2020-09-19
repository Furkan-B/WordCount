package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class WordCount {
    public int getUniqueWordCount(String input) {

        if(Objects.isNull(input))
            throw new IllegalArgumentException("null!!");

        input = input.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] wordArray = input.trim().split("\\s+");

        HashSet<String> uniqeWords = new HashSet<>(Arrays.asList(wordArray));

        return uniqeWords.size();
    }

}
