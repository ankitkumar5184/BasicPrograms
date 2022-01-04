package Numberseries;

public class Series3 {
    public static void main(String[] args)
    {
        int a = 6;
        for(int i=1;i<=a;i++)
        {
           for(int j = 1;j<=i;j++)
           {
               System.out.print(j+" ");
           }
           for(int j=i-1;j>=1;j--)
           {
               System.out.print(j+" ");
           }
           System.out.println();
        }
    }
}
