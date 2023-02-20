import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Расскажите о вашем друге");

        Scanner in = new Scanner(System.in);
        String about = in.nextLine();
        System.out.println("Как зовут вашего друга?");
        String name = in.nextLine();
        System.out.println("Сколько лет вашему другу?");
        String age = in.nextLine();

        System.out.println("Моему другу " + name + " сейчас " + age + " лет");
        System.out.println("Что я могу о нем сказать: " + about);
    }
}
