package Searching.Sorting;
import java.util.Arrays;

public class Count{
    static void countingsort(int arr[]) {
        System.out.println("Input Array: " + Arrays.toString(arr));
        int max_val = findMax(arr);
        int count[] = new int[max_val + 1];

        // Counting the occurrences of each element
        for (int num : arr) {
            count[num] += 1;
        }
        System.out.println("Count Array: " + Arrays.toString(count));

        // Calculating cumulative counts
        for (int i = 1; i <= max_val; i++) {
            count[i] += count[i - 1];
        }
        System.out.println("Cumulative Count Array: " + Arrays.toString(count));

        int output[] = new int[arr.length];

        // Building the output array
        for (int num : arr) {
            output[count[num] - 1] = num;
            count[num] -= 1;
        }
        System.out.println("Sorted Output Array: " + Arrays.toString(output));
    }

    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 8, 3, 3, 1 };
        countingsort(arr);
    }
}
