package io.mercury;

public class ValidPalindrome {




























    public boolean solutionOne(String s) {

        if (s.length() <= 1)
            return true;

        int size = s.length();
        int offset = size % 2 != 0
                ? size / 2 + 1
                : size / 2;

        int i = 0;
        int j = size -1;

        while (i < offset || j > size - offset) {

            char start = toUppercase(s.charAt(i));
            char end = toUppercase(s.charAt(j));

            if (isNotAlphaNumeric(start) && isNotAlphaNumeric(end)){
                i ++;
                j --;
                continue;
            }


            if (isNotAlphaNumeric(start)) {
                i ++;
                continue;
            }

            if (isNotAlphaNumeric(end)) {
                j --;
                continue;
            }

            i++;
            j--;

            if (start != end)
                return false;
        }

        return true;
    }

    private char toUppercase(char character) {
        return character >= 65 && character <= 90
                ? character += 32
                : character;
    }

    private boolean isNotAlphaNumeric(int character) {
        return (character < 48 || character > 57) && (character < 97 || character > 122);
    }
}
