package homework.task_homework_stream_;

import java.util.HashMap;
import java.util.Map;

public class CoutOfWords {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String s = "Мама  мама мыла мыла мыла мыла раму".toLowerCase();// преобразую буквы в нижни регистр
        String[]words =s.split(" "); //делю строку на части

        for (String word : words){
            if (word.isEmpty()){
                continue;
            }
            if(map.containsKey(word)) {
                map.put(word, map.get(word) +1);
            }
            else {
                map.put(word,1);
            }
    }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
}}
