package rekord.zad1;

public class TestBookDTo {

    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Balldyna", "Juliszu Słowacki",
                30.45, 2020);
        System.out.println(b1);
        BookDTO b2 = new BookDTO("Balldyna", "Juliszu Słowacki",
                30.45, 2020);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b1.hashCode());
        System.out.println(b1.price());
        //b1.price() = 12.9;
    }
}
