public class code4 {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;
        System.out.println("Original: " + num);
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}