package zad12;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        Double[] tab1 = {4.5, -4.8, -9.23, 23.00};
        swap(tab1, 1,3);
        System.out.println(Arrays.toString(tab1));
        String[] tab2 = {"RR", "dfdfg", "ppp"};
        swap(tab2, 2,0);
        System.out.println(Arrays.toString(tab2));
    }

    public static <T> void swap(T[] array, int ind1, int ind2){
        if (array ==null || array.length ==0){
            throw new IllegalArgumentException("Tablica jest nullem lub jest pusta");
        }
        if (ind1<0 || ind1>= array.length || ind2 <0 || ind2>= array.length){
            throw new IllegalArgumentException("Błedny indeks");
        }
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}
