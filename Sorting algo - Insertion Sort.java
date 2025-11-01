# Algorithm :Insertion sort and steps.

Sure! Here's the **Insertion Sort** code written **entirely using only `for` loops**, without using a `while` loop:

### ✅ Java Code (Only `for` Loop)

```java
public class InsertionSortWithFor {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j;

            // Use for loop instead of while loop
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j]; // shift elements right
            }

            arr[j + 1] = key; // insert the key at correct position
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

```

---

This version does the same as the regular insertion sort but uses a **`for` loop instead of `while`** for shifting elements.
