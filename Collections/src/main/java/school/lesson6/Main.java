package school.lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] arrayList = {"Вася", "Петя","Cвета", "Коля","Лена","Аня", "Лена","Андрей","Коля","Лена", "Дима"};

        HashMap <String, Integer> quantity = new HashMap<>();

        for (String word: arrayList){
            if (quantity.containsKey(word)){
                quantity.put(word, quantity.get(word) + 1);
            } else {
                quantity.put(word,1);
            }
        }

        System.out.println("Cписок уникальных слов: " );
        for (Map.Entry<String, Integer> o : quantity.entrySet()) {
            System.out.println(o.getKey());
        }

        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry: quantity.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
