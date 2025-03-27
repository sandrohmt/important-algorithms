package binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Evita overflow em arrays grandes

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,9,11,13};
        int target = 7;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Elemento encontrado na posição: " + result);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
