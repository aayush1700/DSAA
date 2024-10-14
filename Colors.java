import java.util.ArrayList;
import java.util.HashMap;

public class Colors {
    public static void main(String[] args) {
        int one=0;
        int two=0;
        int zero=0; 
        int nums[]={2,0,1};

        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:nums)
        {
            if(i==0){
                map.put(i, ++zero);
            }
            else if(i==1)
            {
                map.put(i, ++one);
            }
            else{
                map.put(i, ++two);
            }   
        }

       
        int index=0;
        if(map.containsKey(0))
        {
            for(int i=0;i<map.get(0);i++)
            {
                nums[index++]=0;
            }
        }
        if(map.containsKey(1))
        {
            for(int i=0;i<map.get(1);i++)
            {
                nums[index++]=1;
            }
        }
        
        if(map.containsKey(2)){
            for(int i=0;i<map.get(2);i++)
            {
                nums[index++]=2;
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }

        ArrayList<Integer>arr=new ArrayList<>(null);
        arr.removeAll(arr);
        
    }
}
