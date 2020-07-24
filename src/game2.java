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

    public static void main(String[] args) {
        String hiddenWord = words [rand.nextInt(words.length)];
        String userWord = sc.nextLine();
        String[] grid = new String[15];
        for (int i = 0; i < 15 ; i++) {
            grid[i] = "#";
            System.out.printf(grid[i]);
        }

//        String str = "apple";
//        str.charAt(0);
//        System.out.println(hiddenWord);
        System.out.println(userWord.charAt(3));
            
        }
}
