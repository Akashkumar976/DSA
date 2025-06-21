public class CountSorting {
    public static void main(String[] args) {
        int arr[] = {4, 3, 12, 1, 5, 5, 3, 9};
        countingSort(arr);
    }

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int num : arr) {
            count[num - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}
