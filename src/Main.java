import java.util.Scanner;
import ru.ntology.service.LeapYearCalc;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате: yyyy");
        int year = scanner.nextInt();
        System.out.println("Введите количество дней: yyyy");
        int numberOfDays = scanner.nextInt();
        System.out.println("В этом году " + LeapYearCalc.leapYearCalc(year) + "дней");
    }
}