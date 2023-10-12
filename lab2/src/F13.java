import java.util.Arrays;

public class F13 {
    public static void main(String[] args) {
        int[] tab = {4,-5,-9,20};
        System.out.println(Arrays.toString(tab));
        System.out.println("Min="+minimumValue(tab));
    }

    public static int minimumValue(int[] tab)
    {
        int temp = tab[0];
        for(int i=1;i<tab.length;i++)
        {
            if (tab[i] < temp)
            {
                temp = tab[i];
            }
        }
        return temp;
    }
}
