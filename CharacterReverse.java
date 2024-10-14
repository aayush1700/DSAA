import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        String s="Hello world";
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            // char ch=s.charAt(i);
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        Scanner sc=new Scanner(System.in);
    }
}
