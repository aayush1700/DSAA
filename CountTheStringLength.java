public class CountTheStringLength {
    public static void main(String[] args) {
        String s1="The hello";
        int length=0;
        for (char ch:s1.toCharArray()) {
            length++;
        }
        System.out.println(length);
    }
}
