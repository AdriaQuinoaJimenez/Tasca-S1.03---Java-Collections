package nivell1.exercici1.model;

import java.util.ArrayList;

public class Year {

    private ArrayList<Month> months;

    public Year() {
        this.months = new ArrayList<>();
    }

    public void addMonth(Month month) {
        this.months.add(month);
    }

    public void addMonthPosition(int index, Month month) {
        this.months.add(index, month);
    }

    public ArrayList<Month> getMonths() {
        return this.months;
    }
}
