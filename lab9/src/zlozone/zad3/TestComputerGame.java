package zlozone.zad3;

public class TestComputerGame {

    public static void main(String[] args) {
        double[] tab = {3,4.5, 7.2};
        ComputerGame c1 = new ComputerGame("AA", "XX", tab);
        System.out.println(c1);
        ComputerGame c2 = new ComputerGame("AA", "XX", new double[]{3, 4.5, 7.2});
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode() == c2.hashCode());
        double[] temp = c1.getRatings();
        temp[0] = 234;
        System.out.println(c1);
    }
}
