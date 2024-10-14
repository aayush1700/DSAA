import java.util.ArrayList;

public class LeftRotation{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        int k=4;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        while(k>0)
        {
            int temp=list.get(0);
            for(int i=0;i<list.size()-1;i++)
            {
                list.set(i, list.get(i+1));
            }
            list.set(list.size()-1, temp);
            k--;
        }

        for (int  i : list) {
            System.out.println(i);
        }
    }
}