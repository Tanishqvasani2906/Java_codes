import java.util.Scanner;
public class Microsoft_main {
    public static void main(String[] args) 
    {
         Microsoft_product[] m = new Microsoft_product[5];
         Scanner sc = new Scanner(System.in);
        int n,i;

        for (i=0;i<1;i++)
        {
            m[i] = new Microsoft_product();
            System.out.println("enter name of product :");
            m[i].setActivation_key(sc.next());
            System.out.println("enter the product number :");
            m[i].setProduct_no(sc.nextFloat());
            System.out.println("enter the activation key :");
            m[i].setActivation_key(sc.next());
            System.out.println("enter the price of product :");
            m[i].setPrice_of_product(sc.nextFloat());

        }
        System.out.println("Select 1 to search from Product Name...");
        System.out.println("Select 2 to search from Product Number...");
        n = sc.nextInt();
        
        if(n==1)
        {

            System.out.println("ENTER THE PRODUCT NAME :");
            String name = sc.next();
            for(i=0;i<m.length;i++)
            {
                    if (m[i].getProduct_name().equals(name) )
                    {
                        m[i].display();
                        break;
                    }

                }

            
        }
        else if(n==2)
        {
            
            
                System.out.println("ENTER THE PRODUCT NUMBER :");
                int number = sc.nextInt();
                for(i=0;i<m.length;i++)
                {
                    if(m[i].getProduct_no() == number)
                    {
                        m[i].display();
                        break;
                    }
                    
                }
            
        }
        else
        {
            System.out.println("NOT A VALID NUMBER...");
        }
    }


}
