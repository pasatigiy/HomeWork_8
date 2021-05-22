/**
 * Написать программу для проверки является ли любое выбранное слово в строке полиндромом.
 */


public class Task_3 {
    public static void main(String[] args) {

        String string = new String("казак пришел в кабак");
        String[] array = string.split(" ");

        int wordNumber = 3;
        if (wordNumber <= array.length){
            int n = array[wordNumber].length();
            for (int i =0; i<(n/2); ++i){
                if (array[wordNumber].charAt(i) != array[wordNumber].charAt(n-i-1)){
                    System.out.println(" не является");
                    return;
                }
            }
            System.out.println(" Является полиндромом");

        }else {
            System.out.println(" В строке нет такого количества слов");
        }
        }

    }

