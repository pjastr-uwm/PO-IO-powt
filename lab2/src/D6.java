public class D6 {
    public static void main(String[] args) {
        System.out.println(foo(1));
        System.out.println(foo(2));
        System.out.println(foo(3));
    }

    public static double foo(int n)
    {
        double temp =1.0;
        for(int i=1;i<=n;i++)
        {
            temp /= 7;
        }
        return temp;
    }
}
