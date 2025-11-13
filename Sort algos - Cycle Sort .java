## Algorithm : Cycle sort and steps

### ✅ **Cycle Sort (Code + Step-by-Step Explanation)**

---

### 🔷 What is Cycle Sort?

Cycle Sort is an **in-place**, **non-stable**, and **efficient** sorting algorithm when **memory writes are costly** (e.g., in EEPROMs or Flash memory).

It minimizes the number of memory writes—**exactly (n – 1) writes in the best case**.

---

### 🔷 Where it's used?

- Sorting with minimum number of writes
- Perfect for **sorting read-only memory** or **memory-limited devices**

---

### 🔷 Time and Space Complexity

| Case | Time | Space |
| --- | --- | --- |
| Best | O(n²) | O(1) |
| Avg | O(n²) | O(1) |
| Worst | O(n²) | O(1) |

---

## ✅ Code: Cycle Sort (Java)

```java
class CycleSort {
    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
            int item = arr[cycle_start];

            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycle_start) continue;

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        cycleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

```

---

## ✅ Step-by-Step Explanation

Let's sort:

```
arr = [4, 3, 2, 1]

```

### 🔸 Step 1: Outer loop begins at index `cycle_start = 0`

- `item = 4`
- Count elements smaller than 4: → `3` elements (3, 2, 1)
- So, correct `pos = 3`

Swap `4 ↔ 1`:

Now:

```
arr = [4, 3, 2, 4], item = 1

```

🔁 Repeat until `pos == cycle_start`

- New item = 1
- Count how many smaller than 1 → `0` → pos = 0
- Swap `1 ↔ 4`:
    
    Now:
    

```
arr = [1, 3, 2, 4]

```

Cycle 1 complete ✅

---

### 🔸 Step 2: `cycle_start = 1`

- item = 3
- Count elements smaller than 3 → (2 only) → pos = 2
- Swap `3 ↔ 2` → Now `item = 2`, array: `[1, 2, 3, 4]`
- New pos of 2 = 1 → swap `2 ↔ 2` → done

---

### 🔸 Step 3: `cycle_start = 2`

- item = 3 → already in place (pos = 2)

---

### 🔸 Step 4: `cycle_start = 3`

- Last element, skip.

---

### 🔷 Final Array:

```
[1, 2, 3, 4]

```

---

### ✅ Summary:

- It cycles each item to its correct position.
- Only writes to memory when absolutely necessary.
- Great when **write operations are expensive**.
