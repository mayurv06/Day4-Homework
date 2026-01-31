public class code11{
    public static void main(String[] args) {
        int num = 58249;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            int temp = Math.abs(num);
            while (temp > 0) {
                temp = temp / 10; 
                count++;        
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
