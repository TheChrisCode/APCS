package WeekSep12_Sep16_2022.Sep16_Test;

public class StringStuff {
    
    // Method 1
    // returns the middle character from the given String
    // if the String has an even length, it returns the 
    // character on the LEFT not the RIGHT!
    public String middle(String word) {
        if(word.length() % 2 == 1) {
            return word.substring(((word.length() - 1) / 2), ((word.length() - 1) / 2)+1);
        } else {
            return word.substring((word.length() / 2) - 1, (word.length() / 2));
        }
    }

    // Method 2
    // returns a new String that is the first two characters
    // and the last two characters of the given String
    public String firstLastTwo(String word) {
        if (word.length() < 4) {
            return "fail";
        }
        String firstLetter = word.substring(0, 2);
        String lastLetter = word.substring(word.length()-2);
        return firstLetter + lastLetter;
    }

    // Method 3
    // returns the sum of the two indicies of the given letter
    public int sumIndices(String word, String letter) {
        String i = letter.substring(0, 1);
        int count = 0;
        int answer = 0;
        int wordLength = word.length();
        while (count < wordLength) {
            if(word.substring(count, count + 1).equals(i)) {
                answer += count;
            }
            count++;
        }
        return answer;
    }

    // Method 4
    // returns a new String that has all the same characters
    // as the given word except the FIRST and LAST
    public String exceptFirstLast(String word) {

        return word.substring(1, word.length()-1);
    }



}