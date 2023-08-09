import java.text.StringCharacterIterator;
import java.util.Scanner;
public class Morse_code {
    public static void main(String[] args) {
        char alphabet[] = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U',
        'V','W','X','Y','Z'}; 
        String morsecode[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String codestring[] = { };

        System.out.println("ENTER THE STRING U WANT IN THE MORSE CODE : ");
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        System.out.println("THE DECODED STRING IS : ");
        String s =Input.toUpperCase();
        System.out.println(s);
        for (int i=0;i<Input.length();i++){
            for(int j=0;j<25;j++)
            {
                if(alphabet[j]==morsecode.charAt(i))
                {
                    System.out.print(morsecode[j]);
                }
            }
        }


        

    }
}
