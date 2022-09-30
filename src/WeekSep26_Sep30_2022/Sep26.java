package WeekSep26_Sep30_2022;

public class Sep26 {
    public static void main(String[] args) {
        // interesting while loops
        // string reversal algorithms
        String name = "Pickle Rick";

        // first print out string in forward order
        int index = 0;
        // index <= name.length()-1
        while(index < name.length()) {
            System.out.println(name.charAt(index));
            index++;
        }

        // print out in reverse order
        int indexRev = name.length()-1;

        while(indexRev >= 0) {
            System.out.println(name.charAt(indexRev));
            indexRev--;
        }

        // count the number of digits in an integer
        //For ex. if the int was 1024, there are 4 digits

        //way 1:
        //String myDigies = 1024 + "";
        //System.out.println(myDigies.length());

        // way 2 involving a loop:
        int number = 10241024;
        int count = 0; // the purpose is to count the number of digits
        while(number > 0) {
            count++;
            System.out.println(number%10);
            number /= 10; // number = number / 10

        }
        System.out.println(count);



    }
}
