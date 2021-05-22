/**
 * Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */

public class Task_1 {
    public static void main(String[] args) {

        String string = new String("Итерация свойственна человеку, рекурсия божественна");
        String testWord = new String("           ");
        String[] words = string.split(" ");

        for (int i=0; i<words.length; i++){            // в этом цикле находим самое короткое слово
            if (testWord.length()>=words[i].length()){
                testWord = words[i];
            }
        }
        System.out.println(testWord);

        testWord = " ";

        for (int i=0; i<words.length; i++){            // в этом цикле находим самое длинное слово
            if (testWord.length()<=words[i].length()){
                testWord = words[i];
            }
        }
        System.out.println(testWord);

    }
}
