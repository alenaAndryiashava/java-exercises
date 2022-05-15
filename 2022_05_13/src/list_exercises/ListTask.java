package list_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListTask {
    //    1. Есть два класса: Address с полями улица и номер дома и Person с полями
    //    // имя и Address. Нужно написать метод, который по списку persons возвращает
    //    // список их адресов


    //    //2. Есть список с именами Ivan, Maria, Stephan, John, Amalia. Написать
    //    // метод, возвращающий список в котором не содержатся имена исходного листа длиной 4
    public static List<String> listWithoutNamesLength4(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.length() != 4)
                result.add(s);
        }
        return result;
    }
    //    //3. Есть два листа одинаковой длины с числами. Написать метод, который вернет лист с элементами Yes or No,
    //    //где значение на i-ом месте зависит от того, равны ли элементы двух списков под номером i
    //    // {1,2,3,4} and {5,2,3,0}->{No,Yes,Yes,No}

    public static List<String> YesOrNo(List<Integer> list1, List<Integer> list2) {
        List<String> resultYesNo = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i)))
                resultYesNo.add("Yes");
            else
                resultYesNo.add("No");

        }
        return resultYesNo;
    }

    //    //4. Написать метод, реверсирующий лист целых чисел. Возвращает его в обратном
    //    порядке. Можно решать любым способом, какой вам нравится.

    public static List<Integer> ReversList(List<Integer> list) {
        List<Integer> resultRevers = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            resultRevers.add(i);
        }
        return resultRevers;
    }
}
