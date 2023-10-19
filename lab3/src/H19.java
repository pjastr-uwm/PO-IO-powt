public class H19 {

    public static void main(String[] args) {
        System.out.println(countOccurrences(new StringBuffer("Hello Worldąą"), 'ą'));
    }

    public static int countOccurrences(StringBuffer sb, char c)
    {
        int counter = 0;
        for(int i=0;i< sb.length();i++)
        {
            if(sb.charAt(i) == c)
            {
                counter++;
            }
        }
        return counter;
    }
}
