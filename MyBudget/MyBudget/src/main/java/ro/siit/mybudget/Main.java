package ro.siit.mybudget;

import java.util.Arrays;

/**
 * Created by andrei on 7/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        Expense[] expenses = new Expense[args.length];
        for(int i = 0;i<args.length;i++){
            String[] splitStrings = args[i].split("_");
            Expense e = new Expense(splitStrings[1], Float.parseFloat(splitStrings[0]));
            expenses[i] = e;
        }


        /*Expense [] expenses = new Expense[]{
                new Expense("food", 10),
                new Expense("bills", 35),
                new Expense("bills", 5),
                new Expense("car", 25)};*/


        Income [] incomes = new Income [] {
                new Income(100),
                new Income(100)};

        BudgetReports reports = new BudgetReports();

        float endOfMonthBudget = reports.getEndOfMonthBudget(expenses, incomes);

        System.out.println(endOfMonthBudget);
    }


}
