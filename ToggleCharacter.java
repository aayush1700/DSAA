public class ToggleCharacter {
    public static void main(String[] args) {
        String s="Hello WORLd";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                ch = (char) (ch + 32);
                s1=s1+ch;
            }else
            {
                ch=(char) (ch-32);
                s1=s1+Character.toUpperCase(ch);
            }
        }
        System.out.println(s1);
    }
}
