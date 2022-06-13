package lesson_05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
        String myName1 = "Teo"; // Declare litaretion
        String myName2 = "Teo"; // Declare litaretion
        String myName3 = new String("Teo"); //via String object
        int totalDigit = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;
        String myPassword = "123myPassword";
        char[] myCharacter = myPassword.toCharArray();
        for (char character : myCharacter) {
            if (Character.isDigit(character)) totalDigit++;
            else if (Character.isLowerCase(character)) totalLowerCase++;
            else if (Character.isUpperCase(character)) totalUpperCase++;
        }

        if (totalDigit >0 && totalLowerCase > 0 && totalUpperCase > 0){
            System.out.println("You are all set!");
        } else {
            System.out.println("Password format is wrong ");
        }

        // Immutable | Replacement
        String badWordContainer = "bad,very, bad, sth, else, bad";
        String filteredStr = badWordContainer.replace("bad","b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);

        // Trim() Loai bo khoang trang 2 dau

        // SUbString(), indexof() tim index cua chuoi ,Split()
        String url = "https://www.google.com/";
        System.out.println(url.indexOf("h"));
        System.out.println(url.length());
        System.out.println(url.indexOf("https"));

        System.out.println(url.substring(0, 3)); // lay ki tu co index 0 -2
        System.out.println(url.substring(2));

        //Split
        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));

        //Regex | Reegular Expression
        String myCookingTime = "   105 mins    ";

        //TODO: Pattern and Master
        // [^0-9] : tat ca nhung ki tu ngoai tru tu 0-9 replace bang null
        String cookingTimeNumberStr = myCookingTime.replaceAll("[^0-9]","");
        System.out.println(cookingTimeNumberStr); // String
        int cookingTime = Integer.valueOf(cookingTimeNumberStr);

        System.out.println("Cooking time is: " + (cookingTime + 1));

        // Concatenation : noi chuoi

        String s1 = "Hello ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2));
        System.out.println((s1 + s2));

        //String builder


    }
}
