import java.util.Scanner;

public class StepTracker {
     int punkt;
     MonthData[] monthData = new MonthData[12];
     Scanner scanner = new Scanner(System.in);

    public StepTracker() {
        for(int i = 0; i < 12; ++i) {
            monthData[i] = new MonthData(String.valueOf(i + 1));
        }
    }

     void printStatic(int StepGoal)
    {
        System.out.println("Вы в методе статистика");
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if(monthNumber < 0 || monthNumber > 12) {
            System.out.println("Неверное число");
            return;
        }
        System.out.println("1 -количество пройденных шагов за месяц ");
        System.out.println( "2-максимальное количество шагов за день месяца");
        System.out.println( "3 максимальная серия");
        System.out.println( "4 количество пройденных километров");
        System.out.println( "5 количество сожжённых килокалорий");
        System.out.println( "6 - Количество дней с выполненной целью по количеству шагов");
        System.out.println( "7 - Вывод статистики по месяцам процент с выполненой целью");
        System.out.println( "8 - рекомендованная цель по количество шагам");
        punkt = scanner.nextInt();
        if (punkt == 0)
        {
            return;
        }
        if(punkt == 1)
         {
            System.out.println("Вы выбрали количество пройденных шагов за месяц");
            monthData[monthNumber-1].printDayStepsFromMonth();
        }
        if(punkt == 2)
        {
            System.out.println("Вы выбрали максимальное количество шагов за день месяца");
            monthData[monthNumber-1].maxSteps();
        }
        if (punkt == 3)
        {
            System.out.println("Вы  выбрали максимальную серию введите значение больше,которого должны быть числа серии");
            int goalByStepsPerDay = scanner.nextInt();
            monthData[monthNumber-1].bestSeries(goalByStepsPerDay);
        }
        if (punkt == 4)
        {
            System.out.println("Введите номер дня");
            int number = scanner.nextInt();
            if(number < 0 || number > 30) {
                System.out.println("Неверное число");
                return;
            }
            int steps = monthData[monthNumber - 1].days[number - 1];
            Converter converter = new Converter();
           converter.convertToKm(steps);
        }
        if (punkt == 5)
        {
            System.out.println("Введите номер дня");
            int number = scanner.nextInt();
            if(number < 0 || number > 30) {
                System.out.println("Неверное число");
                return;
            }
            int steps = monthData[monthNumber - 1].days[number - 1];
            Converter converter = new Converter();
            converter.convertToKilocalories(steps);
        }
        if (punkt == 6)
        {
            monthData[monthNumber-1].DaysGoSteps(StepGoal);
        }
        if(punkt == 7)
        {
            // Месяц + monthName - цель выполнена в % днях
            for (int i = 0; i < 12; i++)
            {

                monthData[i].month_procent(StepGoal);
            }
        }
        if(punkt == 8)
        {
            float sumRecommend = 0;
            for(int i = 0; i < 12; i++)
            {
                sumRecommend = sumRecommend + monthData[i].recommend();
            }
            int recommend = (int) (sumRecommend / 12) / 100 * 120;
            System.out.println(recommend);
        }
    }
     void addNewNumberStepsPerDay()
    {
        System.out.println("Введите номер дня");
        int number = scanner.nextInt();
        if(number < 0 || number > 30) {
            System.out.println("Неверное число");
            return;
        }
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if(monthNumber < 0 || monthNumber > 12) {
            System.out.println("Неверное число");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if(steps < 0) {
            System.out.println("Неверное количество шагов");
        }
        monthData[monthNumber-1].days[number-1] = steps;
    }


}

