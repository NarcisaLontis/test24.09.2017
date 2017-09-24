package ro.siit.mybudget;

/**
 * Created by andrei on 7/17/17.
 */
public class Expense {

    private String category;
    private float value;

    public Expense(String category, float value) {
        this.category = category;
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public String getCategory() {
        return category;
    }
}
