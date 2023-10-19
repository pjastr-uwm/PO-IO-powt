import java.util.Scanner;

public class H6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        for(int i=0;i<temp.length();i+=2)
        {
            System.out.print(temp.charAt(i));
        }
        System.out.println();
    }
}
