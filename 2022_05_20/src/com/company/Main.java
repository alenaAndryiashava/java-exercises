package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,200,300);
        List<Integer> dep = Arrays.asList(110,600,500);
        Main main = new Main();
        System.out.println(main.minPlatforms(arr,dep));


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
