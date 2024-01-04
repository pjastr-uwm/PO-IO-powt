package zad1;

public class Box<T> {

    private T element;

    public Box(T element){
        this.element = element;
    }

    public Box(){

    }

    public void set(T element) {
        this.element = element;
    }

    public T get(){
        return element;
    }
}
