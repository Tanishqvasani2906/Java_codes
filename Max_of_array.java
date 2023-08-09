import java.util.Scanner;
public class Largest_Number 
{
    public static void main(String[] args) {
        int i,n,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF ELEMENTS OF AN ARRAY : ");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("ENTER AN ARRAY :");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max = a[0];
        for(i=0;i<n;i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value: "+max);


    }
}