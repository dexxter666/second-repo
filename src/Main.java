import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //task 1
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Atomic Habits");
        books1.add("Deep work");
        books1.add("Meditations");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Attack on titan");
        books2.add("The 5 A.M. club");
        books2.add("Meditations");

        ArrayList<String> merged = new ArrayList<>();
        for (String book : books1) {
            if (!merged.contains(book)) {
                merged.add(book);
            }
        }
        for (String book : books2) {
            if (!merged.contains(book)) {
                merged.add(book);
            }
        }
        System.out.println(merged);

        //task2
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Interstellar");
        movies.add("The Lord of the Rings");
        movies.add("The Social Network");
        movies.add("Fury");
        String longestMovie = " ";
        for (String movie : movies) {
            if (movie.length() > longestMovie.length()) {
                longestMovie = movie;
            }
        }
        System.out.println("The longest title movie is: " + longestMovie);

        //task3
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Kebab");
        foods.add("Pizza");
        foods.add("Salad");
        foods.add("Pizza");
        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("The word 'Pizza' appears " + count + " times");

        //task4
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Banana");
        System.out.println(fruits);
        for (int i = fruits.size() - 1; i >= 0; i--) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
            }
        }
        System.out.println(fruits);

        //task5
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Pink");
        colors.set(0, "Black");
        colors.set(1, "Black");
        colors.set(2, "Black");
        colors.set(3, "Black");
        System.out.println(colors);
    }}