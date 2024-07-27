package io.mercury.crypto;

import java.util.HashMap;
import java.util.Map;

public class Viegree {

    public static void main(String[] args) {

        Map<String, Integer> alphabet = new HashMap<>();
                alphabet.put("A", 1);
                alphabet.put("B", 2);
                alphabet.put("C", 3);
                alphabet.put("D", 4);
                alphabet.put("E", 5);
                alphabet.put("F", 6);
                alphabet.put("G", 7);
                alphabet.put("H", 8);
                alphabet.put("I", 9);
                alphabet.put("J", 10);
                alphabet.put("K", 11);
                alphabet.put("L", 12);
                alphabet.put("M", 13);
                alphabet.put("N", 14);
                alphabet.put("O", 15);
                alphabet.put("P", 16);
                alphabet.put("Q", 17);
                alphabet.put("R", 18);
                alphabet.put("S", 19);
                alphabet.put("T", 20);
                alphabet.put("U", 21);
                alphabet.put("V", 22);
                alphabet.put("W", 23);
                alphabet.put("X", 24);
                alphabet.put("Y", 25);
                alphabet.put("Z", 26);

                String key = "CRYPTO";
                String message = "WHATANICEDAYTODAY";

                char[] fullkey = "CRYPTOCRYPTOCRYPT".toCharArray();
                for (Character character: fullkey){
                    String str = character.toString();
                    alphabet.get(str);
                }
    }




}
