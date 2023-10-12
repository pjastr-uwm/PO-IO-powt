public class D1 {
    public static void main(String[] args) {
        System.out.println(foo(1));
        System.out.println(foo(2));
        System.out.println(foo(3));
    }

    public static int foo(int n)
    {
        int temp=0;
        for(int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                temp-=i;
            }
            else
            {
                temp+=i;
            }
        }
        return temp;
    }
}
