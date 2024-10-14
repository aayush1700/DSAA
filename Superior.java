import java.util.ArrayList;
import java.util.List;

public class Superior {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2};
        int max=a[0];
        int superiorone=0;
        int superiortwo=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        if(max>a[a.length-1])
        {
            superiortwo=max;
            superiorone=a[a.length-1];
        }
        else
        {
             superiortwo=a[a.length-1];
            superiorone=max;
        }

        list.add(superiorone);
        list.add(superiortwo);
    
        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
