import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = in.nextInt();
        } while(value != 5);

        System.out.println("Вы ввели 5");
    }
}
