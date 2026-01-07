package exercici1.model;

public class CalendarApp {

    private Year year;

    public CalendarApp() {
        this.year = new Year();
    }

    public void run(){
        addMonths();
        addAugust();
        showList();

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

    public void addAugust(){
        year.addMonth(new Month("August"));
    }

    public void showList(){
        System.out.println(year.getMonths());
    }
}
