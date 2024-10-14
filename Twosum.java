import java.util.ArrayList;

public class Twosum {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == 6) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        
        int index[] = new int[list.size()];

        for (int i : list) {
            System.out.println(i);
        }

    }
}
