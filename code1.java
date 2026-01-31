import java.util.Scanner;
public class code1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("The sum of first " + n + " numbers is: " + sum);
        sc.close();
    }
}