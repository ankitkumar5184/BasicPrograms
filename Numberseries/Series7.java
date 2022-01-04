package Numberseries;

public class Series7
{
    public static void main(String[] args)
    {
        int a = 6;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j <=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

