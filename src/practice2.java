import java.util.ArrayList;
import java.util.HashSet;
public class practice2 {
    static HashSet<String> allowed = new HashSet<>();
    static boolean isAllowed(String name){
        return allowed.contains(name);
    }
    public static void main(String [] args){
        //task1
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(3);
        nums.add(5);
        HashSet<Integer> set = new HashSet<>(nums);
        System.out.println(set);

        //task2
        HashSet<String> allowed = new HashSet<>();
        allowed.add("Nurbek");
        allowed.add("Eldar");
        allowed.add("Sukhrob");
        allowed.add("Alim");
        System.out.println(isAllowed("Sukhrob"));


        //task3
        HashSet<Integer> ints = new HashSet<>();
        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.add(5);
        int a = ints.size();
        System.out.println("Size: " + a);
        ints.clear();
        if(ints.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }

        //task4
        HashSet<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Mike");
        names.add("Kutman");
        names.add("Diana");
        names.remove("Diana");
        if(!names.contains("Diana")){
            System.out.println("Removal succeeded");
        }
        System.out.println(names);

        //task5
        HashSet<Integer> sett1 = new HashSet<>();
        HashSet<Integer> sett2 = new HashSet<>();
        sett2.add(1);
        sett2.add(2);
        sett2.add(3);
        sett2.add(4);
        sett1.addAll(sett2);
        System.out.println("Set 1: " + sett1);

        //task6
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(23);
        setA.add(3);
        setA.add(67);
        setA.add(4);
        setB.add(23);
        setB.add(7);
        setB.add(8);
        setB.add(67);
        setA.removeAll(setB);
        System.out.println(setA);

        //task7
        HashSet<Integer> setX = new HashSet<>();
        HashSet<Integer> setY = new HashSet<>();
        setX.add(4);
        setX.add(7);
        setX.add(12);
        setX.add(15);
        setX.add(17);
        setY.add(7);
        setY.add(17);
        setY.add(42);
        setX.retainAll(setY);
        System.out.println(setX);

        //task8
        if(setA.containsAll(setB)){
            System.out.println("Approved");
        }
        else{
            System.out.println("NO");
        }

        //task9
        String sentence = "You and only You are responsible for your decision";
        String currentWord = "";
        HashSet<String> setT = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' '){
                currentWord = currentWord + c;
            }
            else if(!currentWord.isEmpty()){
                setT.add(currentWord);
                currentWord = "";
            }
        }
        if(!currentWord.isEmpty()){
            setT.add(currentWord);
        }
        System.out.println(setT);

        //task10
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("APPLE");
        wordsList.add("apple");
        wordsList.add("Apple");
        wordsList.add("Phone");
        wordsList.add("PHONE");
        for(int i = 0; i < wordsList.size(); i++){
            wordsList.set(i, wordsList.get(i).toLowerCase());
        }
        HashSet<String> lowerCaseWords = new HashSet<>();
        lowerCaseWords.addAll(wordsList);
        System.out.println(lowerCaseWords);


    }
}

