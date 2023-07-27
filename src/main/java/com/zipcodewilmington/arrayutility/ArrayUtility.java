package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class  ArrayUtility <T> extends ArrayList<T> {

    T[] hold;

    public ArrayUtility(T[] things){
        super();
        hold = Arrays.copyOf(things, things.length);
        List<T> hold = Arrays.asList(things);
        this.addAll(hold);
    }
    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        List<T> hold = Arrays.asList(arrayToMerge);
        this.addAll(hold);
        return this.getNumberOfOccurrences(valueToEvaluate);

    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for(T things : this){
            if(things == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T most = null;
        Integer count = 0;
        List<T> hold = Arrays.asList(arrayToMerge);
        this.addAll(hold);
        for(T thing: this){
            if(this.getNumberOfOccurrences(thing)>count){
                count = this.getNumberOfOccurrences(thing);
                most = thing;
            }
        }

        return most;
    }

    public T[] removeValue(T valueToRemove) {
        while(this.remove(valueToRemove));
        return this.toArray(Arrays.copyOf(hold, this.size()));
    }
}
