import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст");
        String age = in.nextLine();

        switch(age)
        {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("ты закончил школу");
                break;
        }
    }
}
