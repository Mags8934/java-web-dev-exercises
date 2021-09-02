package org.launchcode.java.demos;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class characterCounts {

    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toLowerCase().toCharArray();

        HashMap<Character, Integer> dataSet = new HashMap<>();

        for (Character letter : charactersInString) {
            if (dataSet.containsKey(letter)) {

                dataSet.put(letter, dataSet.get(letter) + 1);
            } else {
                dataSet.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : dataSet.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
