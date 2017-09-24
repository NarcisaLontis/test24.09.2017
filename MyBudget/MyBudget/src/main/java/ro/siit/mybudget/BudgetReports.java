package ro.siit.mybudget;

/**
 * Created by andrei on 7/17/17.
 */
public class BudgetReports {

    public float getEndOfMonthBudget(Expense[] expenses, Income[] incomes) {
        float endOfMonthBudget = 0;
        for(Income i : incomes){
            endOfMonthBudget += i.getValue();
        }
        for(Expense e : expenses){
            endOfMonthBudget -= e.getValue();
        }
        return endOfMonthBudget;
    }
}
