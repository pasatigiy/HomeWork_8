public class RunnerTask0 {

    public static void main(String[] args) {

        String number = new String("1111-aBc-2222-bbB-3c4d");

        DocumentNumber.digitable(number); //В данном методе  выводятся на экран два первых блока по 4 цифры

        DocumentNumber.replace(number); // при выводе на экран блоки из трех букв заменяются на *(каждая буква).

        DocumentNumber.printLowerLetters(number); //только одни буквы в формате yyy/yyy/y/y в нижнем регистре

        DocumentNumber.printUpperLetters(number); //буквы в формате "Letters:yyy/yyy/y/y" в верхнем регистре
                                            // (реализовать с помощью класса StringBuilder)

        DocumentNumber.checkABC(number); //проверить содержит ли номер документа последовательность abc

        DocumentNumber.checkStart555(number);//Проверить начинается ли номер документа с последовательности 555.

        DocumentNumber.checkEnd3c4d(number);//Проверить заканчивается ли номер документа на последовательность 3c4d.



    }
}
