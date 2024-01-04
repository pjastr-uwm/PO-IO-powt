package zad14;

import java.util.Comparator;

public class Algorithm {

    public static <T extends Comparable<T>> T minVale(T[] array){
        if (array == null || array.length ==0){
            throw new IllegalArgumentException();
        }
        T temp = array[0];
        for(T elem:array){
            if (temp.compareTo(elem) > 0){
                temp = elem;
            }
        }
        return temp;
    }
}
