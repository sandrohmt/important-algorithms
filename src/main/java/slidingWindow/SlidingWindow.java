package slidingWindow;

public class SlidingWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("O ta manho do array deve ser maior ou igual a constante k!");
        }

        int maxSum = 0;
        int windowSum = 0;

        // Calcula a soma inicial da primeira janeça de tamanho k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Move a janela removendo um elemento e adicionando outro
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Renive i primeiro item da janela e adiciona o proximo
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println("Maior soma de subarray de tamanho " + k + ": " + maxSumSubarray(arr, k));
    }
}
