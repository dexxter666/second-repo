import java.util.ArrayDeque;
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

        //task11
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(15);
        queue.offer(27);
        System.out.println("Peek: " + queue.peek());
        while(!queue.isEmpty()){
            System.out.println("Poll: " + queue.poll());
        }

        //task12
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("pineapple");
        stack.push("strawberry");
        stack.push("lemon");
        while(!stack.isEmpty()){
            System.out.println("Pop: " + stack.pop());
        }

        //task13
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(8);
        deque.addLast(9);

        System.out.println(deque);

        //task14
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        boolean b = deque1.offerFirst(10);
        boolean c =deque1.offerLast(20);
        boolean d = deque1.offerFirst(5);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(deque1);

        //task15
        ArrayDeque<Integer> deque3 = new ArrayDeque<>();
        deque3.addLast(17);
        deque3.addLast(66);
        deque3.addLast(29);

        System.out.println("peek(): " + deque3.peek());
        System.out.println("peekFirst(): " + deque3.peekFirst());
        System.out.println("peekLast(): " + deque3.peekLast());
        deque3.clear();
        System.out.println("After clear:");
        System.out.println("peek(): " + deque3.peek());
        System.out.println("peekFirst(): " + deque3.peekFirst());
        System.out.println("peekLast(): " + deque3.peekLast());

        //task16
        ArrayDeque<Integer> deque4 = new ArrayDeque<>();

        deque4.addLast(10);
        deque4.addLast(20);
        deque4.addLast(30);
        deque4.addLast(40);

        System.out.println("Start: " + deque4);

        System.out.println("poll(): " + deque4.poll());
        System.out.println("pollFirst(): " + deque4.pollFirst());
        System.out.println("pollLast(): " + deque4.pollLast());

        System.out.println("Remaining:");
        while (!deque4.isEmpty()) {
            System.out.println(deque4.poll());
        }
        System.out.println("After empty:");
        System.out.println(deque4.poll());

        //task17
        ArrayDeque<String> deque5 = new ArrayDeque<>();

        deque5.addLast("a");
        deque5.addLast("b");
        deque5.addLast("c");
        deque5.addLast("b");
        deque5.addLast("a");

        System.out.println("Original deque: " + deque5);

        deque5.removeFirstOccurrence("b");
        System.out.println("After removeFirstOccurrence(b): " + deque5);
        deque5.removeLastOccurrence("a");
        System.out.println("After removeLastOccurrence(a): " + deque5);

        //task18
        ArrayDeque<Integer> deque6 = new ArrayDeque<>();
        System.out.println("Initial: size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.add(10);
        System.out.println("After add 10: size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.add(20);
        System.out.println("After add 20: size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.add(30);
        System.out.println("After add 30: size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.remove();
        System.out.println("After remove(): size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.remove();
        System.out.println("After remove(): size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());
        deque6.remove();
        System.out.println("After remove(): size=" + deque6.size() + ", isEmpty=" + deque6.isEmpty());

        //task19
        ArrayDeque<Integer> deque7 = new ArrayDeque<>();
        deque7.add(7);
        deque7.add(14);
        deque7.add(21);
        System.out.println("Before clear: " + deque7);
        deque7.clear();
        System.out.println("After clear, peek(): " + deque7.peek());
        System.out.println("After clear, isEmpty(): " + deque7.isEmpty());

        //task20
        String word = "racecar";
        ArrayDeque<Character> deque8 = new ArrayDeque<>();
        for (char ch : word.toCharArray()) {
            deque8.addLast(ch);
        }
        boolean isPalindrome = true;
        while (deque8.size() > 1) {
            if (!deque8.pollFirst().equals(deque8.pollLast())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }
    }
}

