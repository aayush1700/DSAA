public class Kalendane {
    public static void main(String[] args) {
        int nums[]={-1,-2,-3,-4,-5,-6};

        int n = nums.length;      // Get the length of the input array 'nums'
        int max = Integer.MIN_VALUE; // Initialize 'max' to the smallest possible integer value
        int sum = 0;  // Initialize 'sum' to keep track of the current subarray sum
        
        for (int i = 0; i < n; i++) { // Loop through the elements of the array
            sum += nums[i];         // Add the current element to the 'sum'
            
            if (sum > max) {         // If 'sum' is greater than 'max', update 'max'
                max = sum;
            }

            if (sum < 0) {           // If 'sum' becomes negative, reset 'sum' to 0
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
