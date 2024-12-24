package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterClassification {
    public static void main(String[] args) {

        String str = "eAbT@&ul27#7";

        char [] chars = str.toCharArray();

        int num =0, lowerCase=0, upperCase=0, specialChars=0;

        Map <String, Integer> numValue = new HashMap<>();
        Map <String, Integer> smallLetters = new HashMap<>();
        Map <String, Integer> capitalLetters = new HashMap<>();
        Map <String, Integer> specialValues = new HashMap<>();

        for (char c:chars){
            if (Character.isDigit(c)){
                num++;
//                numValue.put(num);
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else if (Character.isUpperCase(c)) {
                upperCase++;
            }
            else {
                specialChars++;
            }
        }
        System.out.println(num);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(specialChars);
    }
}
