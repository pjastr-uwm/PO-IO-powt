package interfejsy.zad14;

public interface Drawable {

    void draw();

    default void display(){
        System.out.println("Displaying Drawable");
    }

    static String getType(){
        return "Drawable Type";
    }
}
