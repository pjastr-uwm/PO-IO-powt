package kolekcje.zadL1;


import java.util.TreeMap;

public class Alg {

    public <K extends Comparable<K>,V> TreeMap<K,V> subMapInRange(TreeMap<K,V> map, K startKey, K endKey){
        TreeMap<K,V> temp = new TreeMap<>();
        for( var entry: map.entrySet()){
            K key = entry.getKey();
            if (startKey.compareTo(key) <= 0 && key.compareTo(endKey)<= 0){
                temp.put(key, entry.getValue());
            }
        }
        return temp;
    }
}
