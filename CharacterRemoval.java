public class CharacterRemoval {
    public static void main(String[] args) {
        String s="Hello ++/*- World 1234";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='A'||s.charAt(i)>='a')&&(s.charAt(i)<='Z'||s.charAt(i)<='z'))
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);

        String s2="Hii I am Aayush";
        String s3="";

        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)==' ')
            {
                s3=s3;
            }
            else{
                s3=s3+s2.charAt(i);
            }
        }
        System.out.println(s3);
    }    
}
