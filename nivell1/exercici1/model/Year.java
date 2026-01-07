package exercici1.model;

import java.util.ArrayList;

public class Year {

    private ArrayList<Month> months;

    public Year() {
        this.months = new ArrayList<>();
    }

    public void addMonth(Month month) {
        this.months.add(month);
    }

    public ArrayList<Month> getMonths() {
        return this.months;
    }
}
