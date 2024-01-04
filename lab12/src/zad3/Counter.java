package zad3;

import java.util.ArrayList;

public class Counter <T>{

    private ArrayList<T> structure = new ArrayList<>();

    public void add(T element){
        structure.add(element);
    }

    public int getCount(){
        return structure.size();
    }

    @Override
    public String toString(){
        return structure.toString();
    }
}
