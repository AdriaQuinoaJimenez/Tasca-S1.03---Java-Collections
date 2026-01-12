package nivell2.exercici1.controller;

import nivell2.exercici1.model.Restaurant;

import java.util.HashSet;

public class RestaurantApp {
    private final HashSet<Restaurant> restaurants;

    public RestaurantApp() {
        this.restaurants = new HashSet<>();
    }

    public void run(){
        addRestaurant(new Restaurant("Pizzeria", 10));
        addRestaurant(new Restaurant("Hamburgueseria", 20));
        addRestaurant(new Restaurant("Hamburgueseria", 20));
        addRestaurant(new Restaurant("Hamburgueseria", 30));
        addRestaurant(new Restaurant("Restaurant", 10));
        System.out.println(restaurants);

    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }
}
