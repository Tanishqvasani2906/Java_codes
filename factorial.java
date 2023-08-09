import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,num,fact=1;
        System.out.println("ENTER THE NUMBER :");
        num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("FACTORIAL OF A " +num+ " is 5" +fact);
    }
}