# HomeWork_8
Домашнее задание по теме String.
0.Написать программу со следующим функционалом:
  На вход передать строку(будем считать, что это номер документа).
  Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
    Вывести на экран в одну строку два первых блока по 4 цифры
    Вывести на экран номер документа, но блоки из трех букв заменить на *(каждая буква заменятся на *)
    Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
    Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    Проверить начинается ли номер документа с последовательности 555.
    Проверить заканчивается ли номер документа на последовательность 1a2b.
    Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут принимать ввводимую на вход программы строку.

  1. Дана строка произвольной длины с произвольными словами.
  Найти самое короткое слово в строке и вывести его на экран.
  Найти самое длинное слово в строке и вывести его на экран.
  Если таких слов несколько, то вывести последнее из них.

  2. Дана строка произвольной длины с произвольными словами.
  Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. 
  Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

  3. Дана строка произвольной длины с произвольными словами.
  Написать программу для проверки является ли любое выюранное слово в строке полиндромом.
  Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
  Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
