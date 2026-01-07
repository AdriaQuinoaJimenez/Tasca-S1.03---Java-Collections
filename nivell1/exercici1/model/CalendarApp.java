package exercici1.model;

import java.util.HashSet;
import java.util.Iterator;

public class CalendarApp {

    private Year year;

    public CalendarApp() {
        this.year = new Year();
    }

    public void run(){
        addMonths();
        year.addMonthPosition(7, new Month("August"));
        showList();

        HashSet<Month> monthsSet = new HashSet<>(year.getMonths());
        showHashSet(monthsSet);
    }

    public void addMonths(){
        year.addMonth(new Month("January"));
        year.addMonth(new Month("February"));
        year.addMonth(new Month("March"));
        year.addMonth(new Month("April"));
        year.addMonth(new Month("May"));
        year.addMonth(new Month("June"));
        year.addMonth(new Month("July"));
        year.addMonth(new Month("September"));
        year.addMonth(new Month("October"));
        year.addMonth(new Month("November"));
        year.addMonth(new Month("December"));
    }

    public void showList(){
        System.out.println(year.getMonths());
    }

    public void showHashSet(HashSet<Month> monthsSet){

        Iterator<Month> iterator = monthsSet.iterator();
        while(iterator.hasNext()){
            Month month = iterator.next();
            System.out.println(month);
        }
    }
}
