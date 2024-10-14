import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean isCyclicRotation(String p, String q)  {
        int k=p.length();
        if(p.length()!=q.length())
        return false;
        while(k>0){
            char ch[]=p.toCharArray();
            char temp[]=new char[p.length()];
            char ch1=p.charAt(p.length()-1);

            for(int i=p.length()-2;i>=0;i--){
                temp[i+1]=ch[i];
            }
            temp[0]=ch1;
           
            String sb="";
            for(char ch2:temp){
                sb=sb+ch2;
            }
            p=sb.toString();
            
            k--;
            if(p.equals(q))
            return true;
        }
        
        
       return true;
    }
    
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
         HashMap<Character,Integer>map=new HashMap<>();
         int count=1;
         for(int i=0;i<s.length();i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
             int value1=map.get(s.charAt(i));
         }
  
         for(int i=0;i<t.length();i++){
             if(map.containsKey(t.charAt(i))){
                int value=map.get(t.charAt(i));
                if(value>0){
                 map.put(t.charAt(i),value-1);
                }else{
                    return false;
                }
             }
         }
         return true;   
      }


    public static boolean method(String s1,String s2){
        HashMap<Character,Character>map=new HashMap<>();
        boolean flag=true;
        for(int i=0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i)))
            if(!map.containsValue(s2.charAt(i)))
            map.put(s1.charAt(i),s2.charAt(i));
            else{
               return false;
            }
        }

        StringBuilder sb=new StringBuilder();
       

        for(int i=0;i<s1.length();i++){
            char ch=map.get(s1.charAt(i));
            sb.append(ch);
            System.out.println(sb);
        }
        System.out.println(sb);
        if(sb.toString().equals(s2))
        return true;
        else
        return false;
        
    }
    public static void main(String[] args) {
        String s1="badc";
        String s2="baba";
        // boolean flag=Isomorphic.method(s1, s2);
        // System.out.println(flag);
        
        String s3="ab";
        String s4="ba";
        // boolean f=Isomorphic.isAnagram(s3, s4);
        // System.out.println(f);

        String b="abac";
        String c="baca";
        boolean g=Isomorphic.isCyclicRotation(b, c);
        System.out.println(g);
    }
}
