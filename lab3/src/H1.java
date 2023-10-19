public class H1 {
    public static void main(String[] args) {
        System.out.println(reverse("olsztyn"));
        System.out.println(reverse("")+".");
        System.out.println(reverse(null));
    }

    public static String reverse(String arg)
    {
        if (arg == null)
        {
            return null;
        }
        StringBuilder temp = new StringBuilder(arg);
        temp.reverse();
        return temp.toString();
    }
}
