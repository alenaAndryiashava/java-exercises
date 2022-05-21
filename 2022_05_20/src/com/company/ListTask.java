package com.company;
//1. Есть лист положительных целых чисел нечетной длины >=3.
// Известно, что существует индекс элемента этого листа такой, что сумма всех элементов слева от него
// равняется сумме всех элементов справа от него. Найти этот индекс.
//3,2 1 4 1

//2. Найти минимальное количество платформ, требующихся для приема поездов на жд станции.
//Дано время прибытия и отправки поездов.  List arrivals упорядочен

import java.util.Collections;
import java.util.List;

public class ListTask {

    public static int pivotSum(List<Integer> list){
        int sum = 0;
        // sum = list.stream().mapToInt(Integer::intValue).sum();
        for (Integer value : list) {
            sum += value;
        }

        int sumLeft = list.get(0);
        int lastPossiblePivotIndex = list.size()-1;
        int pivotIndex = 0;


        for (int i = 1; i < lastPossiblePivotIndex; i++) {
            int currentEl = list.get(i);
            if (sumLeft == sum-sumLeft-currentEl) {
                pivotIndex = i;
            }
            sumLeft +=currentEl;
        }
        return pivotIndex;
    }
    public  int minPlatforms(List<Integer> arrivals,List<Integer> departures){
        int counterPlatforms = 0;
        int minPlatforms = 0;
        Collections.sort(departures);

        int i=0;
        int j=0;

        while (i<arrivals.size()&&j<departures.size()){
            if (arrivals.get(i)<departures.get(j)){
                counterPlatforms++;
                i++;
                if(counterPlatforms>minPlatforms)
                    minPlatforms=counterPlatforms;
            }
            else {
                counterPlatforms--;
                j++;
            }
        }
        return minPlatforms;
    }
}
