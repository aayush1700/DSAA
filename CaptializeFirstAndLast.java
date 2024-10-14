public class CaptializeFirstAndLast {
    public static void main(String[] args) {
        String s = "hello world";
        String s1[] = s.split("[\\s]");
        String s2 = "";
        // for(String string:s1)
        // {
        // char ch=Character.toUpperCase(string.charAt(0));
        // char ch1=Character.toUpperCase(string.charAt(string.length()-1));
        // s2=s2+ch;
        // for(int i=1;i<string.length()-1;i++)
        // {
        // s2=s2+string.charAt(i);
        // }
        // s2=s2+ch1+" ";
        // }

        String firstchar = "";
        String restchar = "";
        String laststring = "";
        for (String string : s1) {
            firstchar = string.substring(0, 1);
            restchar = string.substring(1, string.length() - 1);
            laststring = Character.toString(string.charAt(string.length()-1));
            s2 = firstchar + restchar + laststring +" ";
            System.out.print(s2);
        }

    }
}
