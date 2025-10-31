# Algorithm:Selection sort and steps

Sure! Let's go through **Selection Sort** with a detailed **step-by-step explanation** and the **Java code**.

---

## ✅ **What is Selection Sort?**

**Selection Sort** is a simple comparison-based sorting algorithm.

It divides the array into two parts:

- **Sorted part** (left side)
- **Unsorted part** (right side)

**Idea:**

In each pass, find the **smallest element** in the unsorted part and **swap it** with the first element of the unsorted part.

---

## 📘 **Step-by-Step Explanation**

Suppose you have this array:

```
[64, 25, 12, 22, 11]

```

### 🔁 Selection Sort Steps:

1. **Pass 1** (i = 0):
    - Find min in `[64, 25, 12, 22, 11]` → min = 11
    - Swap 11 with 64
    - Result: `[11, 25, 12, 22, 64]`
2. **Pass 2** (i = 1):
    - Find min in `[25, 12, 22, 64]` → min = 12
    - Swap 12 with 25
    - Result: `[11, 12, 25, 22, 64]`
3. **Pass 3** (i = 2):
    - Find min in `[25, 22, 64]` → min = 22
    - Swap 22 with 25
    - Result: `[11, 12, 22, 25, 64]`
4. **Pass 4** (i = 3):
    - Find min in `[25, 64]` → min = 25
    - Already in place, no swap
    - Result: `[11, 12, 22, 25, 64]`
5. **Pass 5** (i = 4):
    - Only one element left, it's already sorted

✅ Final sorted array: `[11, 12, 22, 25, 64]`

---

## 💻 **Java Code for Selection Sort:**

```java
class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

```

---

## ⏱️ **Time Complexity:**

- Worst case: O(n²)
- Best case: O(n²)
- Space: O(1) (in-place)
