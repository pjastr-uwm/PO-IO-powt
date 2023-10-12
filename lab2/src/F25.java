import java.util.Arrays;

public class F25 {
    public static void main(String[] args) {
        int[] t1 = {3,-4,5};
        int[] t2 = {3,-4,5};
        System.out.println(checkEquality(t1,t2));
    }

    public static boolean checkEquality(int[] tab1, int[] tab2)
    {
        return Arrays.equals(tab1,tab2);
    }
}
