public class DocumentNumber {

    String number;

    static void digitable (String number){

        String[] array = number.split("-");
        System.out.println(array[0]+" " + array[2]);
    }

    static void replace (String number){

        String newNumber = number.replaceAll("[a-zA-z]", "*");
        System.out.println(newNumber);
    }

    static void printLowerLetters(String number){

        String number1 = number.toLowerCase(); // этот метод переводит нашу строку к одному нижнему регистру

        String number2 = (number1.replaceAll("[\\d]", "")); // этим методом удаляем все числа из строки

        String number3 = number2.replace('-', '/'); // меняем символ "-" на "/".
        System.out.println(number3);}


    static void printUpperLetters (String number){

        String number1 = number.toUpperCase(); // этот метод переводит нашу строку к одному верхнему регистру

        String number2 = (number1.replaceAll("[\\d]", "")); // этим методом удаляем все числа из строки

        String number3 = number2.replace('-', '/'); // меняем символ "-" на "/".

        StringBuilder number4 = new StringBuilder("Letters: ");
        number4.append(number3);
        System.out.println(number4);
        }

    static void checkABC (String number){

        String substring = "abc";
        System.out.println(number.toLowerCase().contains(substring.toLowerCase()));
    }
    static void checkStart555 (String number){

        boolean checkStart = number.startsWith("555");
        System.out.println(checkStart);
    }
    static void checkEnd3c4d(String number){

        boolean checkEnd = number.endsWith("3c4d");
        System.out.println(checkEnd);
    }
    }


