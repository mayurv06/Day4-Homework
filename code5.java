public class code5 {
    public static void main(String[] args) {
        int[] numbers = {14, 52, 8, 91, 37, 5};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num; 
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}