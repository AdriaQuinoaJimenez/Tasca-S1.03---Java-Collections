package nivell1.exercici3.app;

import nivell1.exercici3.model.Capital;

public class Main {
    public static void main(String[] args) {
        Capital capitals = new Capital();

        capitals.loadCountries();
        capitals.game();
    }
}
