import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {
        int repeat;
        do {
            game();
            System.out.printf("Повторить игру еще раз? 1 – да / 0 – нет \n");
            repeat = sc.nextInt();
        } while (repeat == 1);

    }
    public static void game()
    {
        int hiddenNumber = rand.nextInt(3);
//        System.out.printf("Я загадал число %d\n", hiddenNumber);
            for (int i = 0; i < 3; i++) {
            System.out.printf("Введите число \n");
            int num = sc.nextInt();
            if (num == hiddenNumber)
            {System.out.printf("Угадал \n");
                break;}
            if( num > hiddenNumber)
            {
                System.out.printf("Я загадал число меньше\n");
            }
            else
            {
                System.out.printf("Я загадал число больше\n");
            }
        }

    }

}







