import java.util.Random;
import java.util.Scanner;

public class game2 {
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String hiddenWord = words[rand.nextInt(words.length)];
    static String userWord = new String();


    public static void main(String[] args) {
        System.out.printf("%s\n", hiddenWord);
        String userWord = sc.nextLine();
//        System.out.printf("%d",hiddenWord.length());
//        System.out.printf("%d", userWord.length());

            for (int i = 0; i < Math.min(hiddenWord.length(), userWord.length()); i++) {
                if (userWord.charAt(i) == hiddenWord.charAt(i)) {

                    System.out.printf("%c", userWord.charAt(i));

                } else {
                    System.out.printf("%c", '#');
                }
            }
        }

    }



//        public static void gameWord () {
//
//            String userWord = sc.nextLine();
//            for (int i = 0; i < hiddenWord.length(); i++) {
//                if (userWord.charAt(i) == hiddenWord.charAt(i)) {
//                    System.out.printf("%c", userWord.charAt(i));
//                } else {
//                    System.out.printf("%c", '#');
//                }
//
//            }
//        }


//    public static void wordToArray( String word) {
//        char[] wordToArray = word.toCharArray();
//        for (int i = 0; i <word.length() ; i++) {
//            wordToArray[i] = word.charAt(i);
//            System.out.printf(" %c", wordToArray[i]);






//        String str = "apple";
//        str.charAt(0);
//        System.out.println(hiddenWord);
//        System.out.println(userWord.charAt(3));
            


