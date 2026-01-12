package nivell2.exercici2.model;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacio == that.puntuacio && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public int compareTo(Restaurant otherRestaurant) {
        int cmpName = nom.compareTo(otherRestaurant.nom);
        if (cmpName != 0) {
            return cmpName;
        }

        return Integer.compare(otherRestaurant.puntuacio, puntuacio);
    }
}
