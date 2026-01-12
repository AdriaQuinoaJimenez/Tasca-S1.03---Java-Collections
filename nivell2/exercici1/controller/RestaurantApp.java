package nivell2.exercici1.controller;

import nivell2.exercici1.model.Restaurant;

import java.util.HashSet;

public class RestaurantApp {
    private final HashSet<Restaurant> restaurants;

    public RestaurantApp() {
        this.restaurants = new HashSet<>();
    }

    public void run(){
        addRestaurant(new Restaurant("Messi", 10));
        toString();

    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

    @Override
    public String toString() {
        return "RestaurantApp{" +
                "restaurants=" + restaurants +
                '}';
    }
}
