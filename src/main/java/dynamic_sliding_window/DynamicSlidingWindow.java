package dynamic_sliding_window;

public class DynamicSlidingWindow {

    public static int minSubArrayLen(int target, int[] arr) {
        int left = 0, currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Tamanho mínimo do subarray: " + minSubArrayLen(target, arr));
    }
}
