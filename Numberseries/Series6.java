package Numberseries;

public class Series6 {
    public static void main(String[] args)
    {
        int a = 6;
        for(int i=a;i>=1;i--)
        {
            for(int j=a;j >=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
