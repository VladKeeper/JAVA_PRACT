```
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 12: ");
        String input = scanner.nextLine();

        try {
            int monthNumber = Integer.parseInt(input);
            if (monthNumber < 1 || monthNumber > 12) {
                throw new InvalidMonthException("Недопустимое число. Введите число от 1 до 12.");
            }

            if (monthNumber == 2) {
                System.out.print("Введите год: ");
                int year = Integer.parseInt(scanner.nextLine());

                if (year <= 0) {
                    throw new IllegalArgumentException("Год должен быть положительным числом.");
                }

                int daysInFebruary = isLeapYear(year) ? 29 : 28;
                System.out.println("Месяц: " + months[monthNumber - 1] + ", Количество дней: " + daysInFebruary);
            } else {
                System.out.println("Месяц: " + months[monthNumber - 1] + ", Количество дней: " + dom[monthNumber - 1]);
            }
        } catch (InvalidMonthException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка ввода. Пожалуйста, введите целое число.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
```
