import java.util.Scanner;
import java.lang.Math;

public class CircleVolume implements ISubscriber{
    public static  void main (String [] args)
    {
        final double PI = 3.1415926535;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double result = ((4/3)*PI*Math.pow(r,3));
        System.out.print("Result = ");
        System.out.println(result);
    }
}
