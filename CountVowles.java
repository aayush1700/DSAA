import java.util.HashMap;
import java.util.Map.Entry;

public class CountVowles {
    
        public static void countVowelsConsonantsSpaces(String s, int n) {
            // Write your code here.
            // HashMap<Integer,Integer>map=new HashMap<>();
            // for(int i=0;i<s.length();i++)
            // {
            //     char ch=s.charAt(i);
            //     if(ch==65||ch==97||ch==69||ch==101||ch==73||ch==105||ch==79||ch==111||ch==85||ch==117)
            //     {
            //         map.put(1,map.getOrDefault(1, 0)+1);
            //     }else if(ch==' ')
            //     {
            //         map.put(2,map.getOrDefault(2, 0)+1);
            //     }else
            //     {
            //          map.put(3,map.getOrDefault(3, 0)+1);
            //     }
            // }
    
            // int index=0;
            // int arr[]=new int[map.size()];
            // for (Entry<Integer, Integer> entry : map.entrySet()) {
            //     arr[index] = entry.getValue();
            //     index=index+1;
            // }

            // for (int i : arr) {
            //     System.out.println(i);
            // }

            int vowel = 0;

            int consonent = 0;
    
            int spaces = 0;
    
            s = s.toLowerCase();
    
            for (int i = 0; i < n; i++) {
    
                char x = s.charAt(i);
    
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
    
                    vowel++;
    
                } else if (x >= 'a' && x <= 'z') {
    
                    consonent++;
    
                } else if (x == ' ') {
    
                    spaces++;
    
                }
    
            }
    
            int[] arr = new int[] { vowel, consonent, spaces };
    
            // arr[0]=vowel; // arr[1]=consonent; // arr[2]=spaces;
    
            for (int i : arr) {
                System.out.println(i);
            }
          
    }
    public static void main(String[] args) {
        String s="hEllOWorlD";
        int length=s.length();
        countVowelsConsonantsSpaces(s, length);
    }
}