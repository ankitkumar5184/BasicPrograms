package Numberseries;

public class LargestNumber
{
    public static void main(String[] args)
    {
        int a=195, b=190, c=155, d;

        d = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
        System.out.println("largest number "+d);
    }
}