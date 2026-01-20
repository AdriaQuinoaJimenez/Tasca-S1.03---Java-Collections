package nivell1.exercici3.model;

import java.io.*;
import java.util.*;

public class Capital {
    private final HashMap<String, String> capitals;
    private final static int MAX_ROUNDS = 10;

    public Capital() {
        this.capitals = new HashMap<>();
    }

    public void loadCountries() {
        String path = System.getProperty("user.dir") + File.separator + "countries.txt";
        File file = new File(path);

        if (!file.exists()) {
            System.err.println("Error: file not found");
            return;
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                if (words.length == 2) {
                    capitals.put(words[0].trim(), words[1].trim());
                }
            }
            System.out.println("Loaded " + capitals.size() + " countries");
        }catch (IOException e){
            System.err.println("Error loading countries " +  e.getMessage());
        }
    }

    public void loadPunctuation(int points, String user) {
        String path = System.getProperty("user.dir") + File.separator + "classificacio.txt";
        File file = new File(path);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,  true))) {
            bufferedWriter.write("L'usuari " + user + " té la puntuacio de: " + points + "\n");
            bufferedWriter.flush();
        }catch (IOException e){
            System.err.println("Error loading punctuation " +  e.getMessage());
        }
    }

    public void game(){
        Scanner sc = new Scanner(System.in);
        List<String> countriesList = new ArrayList<>(capitals.keySet());
        int points = 0;
        String user;

        Collections.shuffle(countriesList);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            String  country = countriesList.get(i);
            String capital = capitals.get(country);

            System.out.println("Pregunta "+ (i+1) +": Quina es la capital de " + country + "?");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(capital)) {
                points++;
                System.out.println("Capital correcta!");
            }else{
                System.out.println("Capital incorrecta!");
            }
        }
        System.out.println("Escriu el teu nom d'usuari: ");
        user = sc.nextLine();
        System.out.println("La teva puntuacio ha estat de: " + points);
        loadPunctuation(points, user);
    }
}
