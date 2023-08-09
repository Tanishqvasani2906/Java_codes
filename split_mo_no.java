import java.util.Scanner;
public class split_mo_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Mobile_no;
        System.out.print("ENTER THE MOBILE NUMBER : ");
        Mobile_no = sc.nextLine();
        System.out.println("Mobile System operator code is : "+Mobile_no.substring(0, 2));
        System.out.println("MSC IS :"+Mobile_no.substring(2, 5));
        System.out.println("UNIQUE CODE IS : "+Mobile_no.substring(5, 10));
        System.out.println("THIS CODE IS PREPARED BY TANISHQ VASANI_22CE136");
    }  
}
