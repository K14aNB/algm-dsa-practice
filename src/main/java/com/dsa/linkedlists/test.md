# Test Data

### 1. The "Empty List" Baseline
*Goal: Ensure the list starts in a valid state.*
*   **Action:** Instantiate the list.
*   **Checks:**
    *   `size()` should be `0`.
    *   `isEmpty()` should be `true`.
    *   `head` should be `null`.
    *   `tail` (if you have one) should be `null`.

### 2. Basic Insertion (Head & Tail)
*Goal: Verify pointer connections work for simple additions.*
*   **Test Data:** Strings `["A", "B", "C"]`
*   **Scenario:**
    1.  `addFront("A")` $\rightarrow$ List: `[A]`, Head: A, Tail: A
    2.  `addFront("B")` $\rightarrow$ List: `[B, A]`, Head: B, Tail: A
    3.  `addBack("C")` $\rightarrow$ List: `[B, A, C]`, Head: B, Tail: C
    4.  **Check:** `size()` must be 3.

### 3. The "Single Element" Life Cycle (Crucial Edge Case)
*Goal: This causes the most NullPointerExceptions. It tests adding to an empty list and emptying a list.*
*   **Test Data:** Integer `100`
*   **Scenario:**
    1.  Start Empty.
    2.  `add(100)`.
    3.  **Check:** Head is 100, Tail is 100. Head.next is null.
    4.  `remove(100)` (or `removeAt(0)`).
    5.  **Check:** `size()` is 0. **Head must be null. Tail must be null.**
    *   *Bug Watch:* Often implementations forget to set `tail` to null when the last element is removed.

### 4. Insertion in the Middle
*Goal: Verify the "bridge" logic (prev.next = node, node.next = current).*
*   **Test Data:** Integers `[1, 3]` inserting `2`
*   **Scenario:**
    1.  List: `[1, 3]`
    2.  `insert(index: 1, data: 2)`
    3.  **Check:** List order should be `1 -> 2 -> 3`.
    4.  **Check:** Node `1` points to `2`. Node `2` points to `3`.

### 5. Removal Logic (Head, Middle, Tail)
*Goal: Ensure links are healed correctly after extraction.*
*   **Test Data:** `[10, 20, 30, 40, 50]`
*   **Scenarios:**
    1.  **Remove Head:** `removeAt(0)` $\rightarrow$ Expect `[20, 30, 40, 50]`. New Head: 20.
    2.  **Remove Tail:** `removeAt(last_index)` $\rightarrow$ Expect `[20, 30, 40]`. New Tail: 40. Tail.next must be null.
    3.  **Remove Middle:** `removeAt(1)` (removing 30) $\rightarrow$ Expect `[20, 40]`.
    *   *Bug Watch:* After removing the tail, does the new tail point to null, or does it still point to the deleted node?

### 6. Value-Based Operations & Duplicates
*Goal: Test searching and handling identical data.*
*   **Test Data:** `["Apple", "Banana", "Apple", "Cherry"]`
*   **Scenarios:**
    1.  `indexOf("Banana")` $\rightarrow$ Expect `1`.
    2.  `indexOf("Apple")` $\rightarrow$ Expect `0` (Should return first occurrence).
    3.  `lastIndexOf("Apple")` $\rightarrow$ Expect `2` (If implemented).
    4.  `remove("Apple")` $\rightarrow$ Expect `["Banana", "Apple", "Cherry"]`. (Removes first occurrence only).
    5.  `contains("Zinc")` $\rightarrow$ Expect `false`.

### 7. Large Data Volume (Stress Test)
*Goal: Check for memory leaks or O(N^2) inefficiencies.*
*   **Test Data:** Numbers `0` to `10,000`
*   **Scenario:**
    1.  Loop `0` to `10000`, `addBack(i)`.
    2.  Check `size()` is 10001.
    3.  Loop `0` to `10000`, `get(i)`.
    *   *Performance Note:* If accessing every element by index takes a long time, your implementation of `get(i)` is correct ($O(N)$) but inefficient for iteration. This is expected for Linked Lists, but ensure it doesn't crash the stack.

### 8. Null Data Handling
*Goal: Does your list support nulls or crash? (Java's standard LinkedList allows nulls).*
*   **Test Data:** `["A", null, "B"]`
*   **Scenario:**
    1.  `add("A")`
    2.  `add(null)`
    3.  `add("B")`
    4.  **Check:** `size()` is 3. `get(1)` returns `null`.
    5.  `remove(null)` $\rightarrow$ Should work and result in `["A", "B"]`.

### 9. Out of Bounds (Error Handling)
*Goal: Verify exceptions are thrown correctly.*
*   **Test Data:** List `[1, 2]`
*   **Scenarios:**
    1.  `get(-1)` $\rightarrow$ Expect `IndexOutOfBoundsException`.
    2.  `get(2)` $\rightarrow$ Expect `IndexOutOfBoundsException` (Indices are 0 and 1).
    3.  `removeAt(5)` $\rightarrow$ Expect `IndexOutOfBoundsException`.

### 10. Reversal (If implemented)
*Goal: Verify complete structural inversion.*
*   **Test Data:** `[1, 2, 3]`
*   **Scenario:**
    1.  Call `reverse()`.
    2.  **Check:** List is `[3, 2, 1]`.
    3.  **Check:** Head is 3. Tail is 1.

### Quick Logic "Sanity Check" Table
When debugging, print your nodes in this format to verify integrity:

| Node Index | Data | Prev (if Double) | Next |
| :--- | :--- | :--- | :--- |
| 0 (Head) | A | null | B |
| 1 | B | A | C |
| 2 (Tail) | C | B | null |