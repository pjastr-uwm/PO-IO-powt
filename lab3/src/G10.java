import java.util.ArrayList;

public class G10 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(-5);
        lt.add(12);
        lt.add(-11);
        System.out.println(lt);
        ArrayList<Integer> kopia = copyArray(lt);
        System.out.println(kopia);
        ArrayList<Integer> lt2 = new ArrayList<>();
        System.out.println(lt2);
        ArrayList<Integer> kopia2 = copyArray(lt2);
        System.out.println(kopia2);
//        ArrayList<Integer> lt3 = null;
//        ArrayList<Integer> kopia3 = copyArray(lt3);
//        System.out.println(kopia3);
    }

    public static ArrayList<Integer> copyArray(ArrayList<Integer> arg)
    {
        /*if(arg == null)
        {
            throw new IllegalArgumentException("arg jest nullem");
        }*/
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<arg.size();i++)
        {
            temp.add(arg.get(i));
        }
        return temp;
    }
}
