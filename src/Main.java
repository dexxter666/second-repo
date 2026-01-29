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

        //task6
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Swimming");
        sports.add("Baseball");
        sports.add("Basketball");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Cricket");
        ArrayList<String> sports2 = new ArrayList<>();
        sports2.add("Football");
        sports2.add("Tennis");
        if(sports.containsAll(sports2)){
            System.out.println("Sublist is present");
        }
        else{
            System.out.println("Sublist isn't present");
        }

        //task7
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulips");
        flowers.add("Lily of the valley");
        flowers.add("Rose");
        flowers.add("Wildflower");
        int firstApp = flowers.indexOf("Rose");
        System.out.println("first index of Rose: " + firstApp);
        int lastApp = flowers.lastIndexOf("Rose");
        System.out.println("last index of Rose: " + lastApp);

        //task8
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Penguin");
        animals.add("Snake");
        animals.add("Penguin");
        animals.add("Polar bear");
        animals.add("Penguin");
        animals.add("Snake");
        animals.add("Racoon");
        animals.add("Cat");
        ArrayList<String> unique = new ArrayList<>();
        for(int i = 0; i < animals.size(); i++) {
            if (!unique.contains(animals.get(i))){
                unique.add(animals.get(i));
            }
            else{}
        }
        System.out.println("Unique list of animals: " + unique);

        //task9
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Melbourne");
        cities.add("Warsaw");
        cities.add("Miami");
        cities.add("Tokyo");
        String [] cityArray = cities.toArray(new String [0]);
        for(int i = 0; i < cityArray.length; i++){
            System.out.println(cityArray[i]);
        }
        //task10
        int [] numbers = {1,2,3,4,5};
        ArrayList<Integer> numbrs = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            numbrs.add(numbers[i]);
        }
        System.out.println(numbrs);


    }

}