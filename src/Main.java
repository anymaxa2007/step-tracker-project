//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        int StepGoal = 0;
        while (true)
        {
            System.out.println("Введите команду");
            System.out.println("1 - ввод цели по количеству шагов в день;");
            System.out.println("2 - Ввод пройденного количества шагов за день");
            System.out.println("3 - вывод статистики за определённый месяц - сколько пройдено шагов/км/килокалорий");
            int menu = scanner.nextInt();
            if (menu == 0)
            {
                System.out.println("Вы закончили работать с программой");
                break;
            }
            if(menu == 1)
            {
                /* TODO Цель по количеству шагов в день - общая для всех месяцев
                   TODO Сохранять, потом добавить в пункт вывода
                    1) Количество дней с выполненной целью по количеству шагов
                    2) Вывод по месяцам (% дней с выполненной целью): Январь - 63%, Февраль - 25%
                    3*) Прогноз рекомендуемой цели по шагам - суммируем пройденное количество шагов в каждом дне в году, делим на кол-во дней, прибавляем 20%
                */
                System.out.println("Введите цель по количеству шагов");
                StepGoal = scanner.nextInt();
                System.out.println("Вы сохранили цель по количеству шагов");
            }
            if(menu== 2)
            {
                stepTracker.addNewNumberStepsPerDay();
            }
            if (menu == 3)
            {
                stepTracker.printStatic(StepGoal);
            }
        }
        }

    }