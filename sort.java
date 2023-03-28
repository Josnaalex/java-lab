import java.util.Scanner;
class sort
{
    public static void main(String[] args)
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
     }
        
    }
}