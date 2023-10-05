import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = input.nextInt();
        System.out.println("Dodanie:" + (a+b));
    }
}
