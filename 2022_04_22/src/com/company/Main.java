package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1 ");
        DayOfWeek wednesday = DayOfWeek.fromString("Wednesday");
        DayOfWeek sunday = DayOfWeek.fromString("Sunday");
        DayOfWeek badDay = DayOfWeek.fromString("WrongName");

        System.out.println(wednesday + " isWeekend = " + isWeekend(wednesday));
        System.out.println(sunday + " isWeekend = " + isWeekend(sunday));
        System.out.println(badDay + " isWeekend = " + isWeekend(badDay));

        System.out.println("Task 2");

    }
    // 1. Написать программу, которая при вводе с клавиатуры дня недели, отвечает
    // на вопрос, является ли этот день выходным. (для выходного ответ it is true, для рабочего
    // it is false.  Использовать в решении класс типа ENUM. Вам может понадобиться метод этого класс
    // valueOf
    // DayOfWeek day=DayOfWeek.valueOf("Wednesday");
    //DayOfWeek day = DayOfWeek.valueOf("WEDNESDAY");

    static boolean isWeekend(DayOfWeek dayOfWeek) {
        if (dayOfWeek == null) {
            return false;
        }
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    // 2. Дана строка, состоящая из слов, разделенных пробелом "aaa BBBB dEfxc"
    //написать метод, позволяющий изменять слова в строке следующим образом:
    // при длине слова =3, изменить все буквы этого слова на заглавные
    // при длине слова =4, изменить все буквы этого слова на строчные
    // при длине слова =5, изменить все буквы слова на звездочки
    // и возвращающий измененную строку
    // пример: дана строка "aaa BBBB dEfxc".
    // при длине слова =3, изменить все буквы слова на заглавные -> "AAA BBBB dEfxc"
    // при длине слова =4, изменить все буквы слова на строчные -> "AAA BBBB dEfxc"

    // public static String transform (String str, XXX)



}
