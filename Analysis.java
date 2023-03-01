package stimuli;
public class Analysis {

    // Insertion sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = i - 1; // j - 1
            }
            arr[j + 1] = key;
        }
    }

    // linear search
    public static double search(int[] arr, int key) { // int
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= key) // ==
                return i;
        }
        return -1;
    }

    // main method; should return the index if found at key, -1 if not
    public static void main(String[] args) {
        int[] arr = {12; 11, 13, 5, 6}; // {12, 11, 13, 5, 6}
        sort(arr);
        int key = 6;
        int index = search(arr, key);
        if (index == -1) { // !=
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
