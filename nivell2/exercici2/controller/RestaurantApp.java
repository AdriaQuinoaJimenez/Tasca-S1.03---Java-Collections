package nivell2.exercici2.controller;

import nivell2.exercici2.model.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
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
        addRestaurant(new Restaurant("Restaurant", 14));
        addRestaurant(new Restaurant("Pizzeria", 30));
        addRestaurant(new Restaurant("Braseria", 20));
        System.out.println("Unordered HashSet: \n" + restaurants);
        orderList();

    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

    public void orderList(){
        ArrayList<Restaurant> orderedRestaurants = new ArrayList<>(this.restaurants);
        Collections.sort(orderedRestaurants);
        System.out.println("Ordered Restaurant List: ");
        for (Restaurant restaurant : orderedRestaurants) {
            System.out.println(restaurant);
        }
    }
}
