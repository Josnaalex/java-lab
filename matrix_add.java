import java.util.Scanner;
class matrix_add
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        System.out.println("Enter no of cols");
        int m=sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][]= new int[n][m];
        System.out.println("Enter matrix 1");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Result");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}