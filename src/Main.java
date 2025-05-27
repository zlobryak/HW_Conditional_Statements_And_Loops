import java.util.Scanner;
import ru.ntology.service.LeapYearCalc;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int successCount = 0;

        while (true) {
            System.out.println("Введите год в формате: yyyy");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней: yyyy");
            int numberOfDays = scanner.nextInt();

            if (LeapYearCalc.leapYearCalc(year) == numberOfDays){
                successCount++;
            } else {
                System.out.println("Неправильно! В этом году" + LeapYearCalc.leapYearCalc(year));
                System.out.println(successCount);
                break;
            }
        }
    }
}