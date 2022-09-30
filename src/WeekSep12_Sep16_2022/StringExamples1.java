package WeekSep12_Sep16_2022;

public class StringExamples1 {

    // returns the average of the lengths of strings a and b
    public double avgLen( String a, String b ) {
        return (a.length() + b.length()) / 2.0;
    }

    // returns the first letter of string a and the last letter of string b
    public String firstLast( String a, String b ) {
        String firstLetter = a.substring(0, 1);
        char lastLetter = b.charAt(b.length()-1);
        return firstLetter + lastLetter;
    }

    // returns the middle character of a given string
    public String middleCharacter( String a ) {
        if(a.length() % 2 == 1) {
            return a.substring(((a.length() - 1) / 2), ((a.length() - 1) / 2)+1);
        } else {
            return a.substring((a.length() / 2), (a.length() / 2) + 1);
        }

    }

}