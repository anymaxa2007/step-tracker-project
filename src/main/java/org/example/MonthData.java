package org.example;

public class MonthData {

     int[] days = new int[30];
     int sum = 0;
     String monthName;
     public MonthData(String monthName) {
         this.monthName = monthName;
     }

     void printDayStepsFromMonth()
    {
        for(int i = 0; i < 30;i++)
        {
            sum = sum + days[i];
        }
        System.out.println(sum);
    }
    void maxSteps()
    {
        int maxStepsDays = 0;
        for(int i = 0; i < 30;i++)
        {
            if(maxStepsDays < days[i]){
                maxStepsDays = days[i];
            }
        }
        System.out.println(maxStepsDays);
    }
     void bestSeries(int goalByStepsPerDay)
    {
        int consecutive = 0;
        int maxStepsDays = 0;
        int k = 0;
        for(int i = 0; i < 30;i++)
        {
            if(maxStepsDays < days[i]){
                maxStepsDays = days[i];
            }
            for(int j = 0; j < 30; j++)
            {
                if (goalByStepsPerDay - 1 < days[j])
                {
                    consecutive = consecutive + 1;
                }
                else
                {
                    if (consecutive > k)
                    {
                        k = consecutive;
                    }
                    consecutive = 0;
                }
            }
        }
        System.out.println(k);
    }
    void DaysGoSteps(int goal)
    {
        int Steps;
        int DaysGoSteps = 0;
        for(int i = 0; i < 30; i++)
        {
            Steps = days[i];
            if(Steps + 1 > goal)
            {
                DaysGoSteps = DaysGoSteps + 1;
            }
        }
        System.out.println(DaysGoSteps);
    }
    void month_procent(int goal)
    {
        float GoalCompletedDays = 0;
        for(int i = 0; i < 30; i++)
        {
            if(days[i] + 1 > goal)
            {
                GoalCompletedDays = GoalCompletedDays + 1;
            }
        }
        float procent = (GoalCompletedDays / 30 * 100);
        System.out.println(procent);
    }
    float recommend()
    {
        float Recommend;
        float StupsMonth = 0;
        for(int i = 0; i < 30;i++)
        {
            StupsMonth = StupsMonth + days[i];
        }
        Recommend = StupsMonth / 30;
        return  Recommend;
    }
}
