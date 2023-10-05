import java.util.Scanner;

public class ZadB4 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = input.nextDouble();
        System.out.println("Podaj b");
        double b = input.nextDouble();
        System.out.println("Podaj c");
        double c = input.nextDouble();
        if (a !=0)
        {
            double delta = b*b - 4*a *c;
            double sqrt_delta = Math.sqrt(delta);
            if (sqrt_delta >0)
            {
                System.out.printf("x1= %f\n", (-b-sqrt_delta)/(2*a));
                System.out.printf("x2= %f\n", (-b+sqrt_delta)/(2*a));
            }
            else if (sqrt_delta ==0 )
            {
                System.out.printf("x= %f\n", (-b)/(2*a));
            }
            else
            {
                System.out.println("Brak rozw.");
            }
        }
        else
        {
            if (b!=0)
            {
                System.out.printf("x= %f\n", (-c)/b);
            }
            else
            {
                if (c!=0)
                {
                    System.out.println("Brak rozw.");
                }
                else
                {
                    System.out.println("Nieskończenie wiele rozw.");
                }
            }
        }
    }
}
