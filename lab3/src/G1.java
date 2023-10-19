import java.util.ArrayList;

public class G1 {

    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            lt.add(i);
        }
        System.out.println(lt);
        for(int i = lt.size()-1;i>=0;i--)
        {
            System.out.println(lt.get(i));
        }
    }
}
