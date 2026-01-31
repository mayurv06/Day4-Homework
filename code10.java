public class code10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};
        int n = arr.length;
        
        int[] visited = new int[n];
        int processedMarker = -1;
        for (int i = 0; i < n; i++) {
          
            if (visited[i] == processedMarker) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = processedMarker;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}