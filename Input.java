import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = in.nextLine();
        System.out.println("Вы ввели: " + string);

        System.out.println("Введите число");
        int x = in.nextInt();
        System.out.println("Вы ввели: " + x);
    }
}
