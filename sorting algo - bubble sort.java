# Algorithm :Bubble sort and steps .

```
 ASCENDING:
  class BubbleSortExample {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 2};
        int n = nums.length;

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

DESCENDING:
class BubbleSortDescending {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 2};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in descending order:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

```

### **Pass 1 (i = 0):**

Compare adjacent elements and swap if left > right.

- Compare 5 and 3 → swap → `[3, 5, 8, 4, 2]`
- Compare 5 and 8 → no swap
- Compare 8 and 4 → swap → `[3, 5, 4, 8, 2]`
- Compare 8 and 2 → swap → `[3, 5, 4, 2, 8]`

✅ Largest element (8) has "bubbled" to the end.

---

### **Pass 2 (i = 1):**

- Compare 3 and 5 → no swap
- Compare 5 and 4 → swap → `[3, 4, 5, 2, 8]`
- Compare 5 and 2 → swap → `[3, 4, 2, 5, 8]`

✅ Second largest (5) moved to its place.

---

### **Pass 3 (i = 2):**

- Compare 3 and 4 → no swap
- Compare 4 and 2 → swap → `[3, 2, 4, 5, 8]`

✅ Third largest (4) placed.

---

### **Pass 4 (i = 3):**

- Compare 3 and 2 → swap → `[2, 3, 4, 5, 8]`

✅ All sorted.

- Algorithm : Selection sort .

Sure! Let's go through **Selection Sort** with a detailed **step-by-step explanation** and the **Java code**.
