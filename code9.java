public class code9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 40};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}