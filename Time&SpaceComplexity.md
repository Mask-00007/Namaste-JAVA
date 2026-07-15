# Time and Space Complexity for DSA

Until now, you have learned:

- **Variables**: store data
- **Loops**: repeat logic
- **Arrays**: organize data
- **Methods**: structure logic

Now comes a critical shift in thinking: not just writing code, but writing **efficient code**.

## Why Do We Need Time Complexity?

Imagine two correct solutions:

- Solution A runs in 1 second.
- Solution B runs in 10 seconds.

Solution A is better. Efficiency becomes especially important as the input grows:

- 1 student and 10 operations is fine.
- 1 lakh students and 10 million operations can be slow.

## What Is Time Complexity?

Time complexity measures how the number of operations grows with input size.

> It does **not** measure actual time in seconds. Actual time depends on the machine; time complexity measures the growth in operations.

## What Is Space Complexity?

Space complexity measures how much extra memory a program uses.

## Big-O Notation

We represent complexity using **Big-O notation**.

| Complexity | Meaning     |
| ---------- | ----------- |
| `O(1)`     | Constant    |
| `O(n)`     | Linear      |
| `O(n^2)`   | Quadratic   |
| `O(log n)` | Logarithmic |

## Common Time Complexities

### 1. `O(1)` - Constant Time

```java
int x = 10;
System.out.println(x);
```

The number of operations remains constant regardless of input size.

### 2. `O(n)` - Linear Time

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop runs `n` times. If `n = 100`, it performs about 100 operations; if `n = 1000`, about 1000.

### 3. `O(n^2)` - Quadratic Time

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

The outer loop runs `n` times and the inner loop runs `n` times for each outer iteration, so total operations are `n x n = n^2`.

For `n = 3`:

```text
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
```

Total operations: `9 = 3^2`.

### 4. `O(log n)` - Logarithmic Time

```java
while (n > 1) {
    n = n / 2;
}
```

Each step halves `n`:

```text
16 -> 8 -> 4 -> 2 -> 1
```

The number of steps is `log n`.

## How to Calculate Time Complexity

### Rule 1: Ignore Constants

```java
for (int i = 0; i < 2 * n; i++) {
    System.out.println(i);
}
```

`O(2n) = O(n)`.

### Rule 2: Drop Lower Terms

`O(n^2 + n) = O(n^2)` because only the highest-growing term matters.

### Rule 3: Nested Loops Multiply

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
```

`O(n x n) = O(n^2)`.

### Rule 4: Separate Loops Add

```java
for (int i = 0; i < n; i++)
    ;

for (int j = 0; j < n; j++)
    ;
```

`O(n + n) = O(n)`.

### Rule 5: Condition-Based Loops

```java
for (int i = 1; i < n; i *= 2)
    ;
```

The value doubles each iteration, so the complexity is `O(log n)`.

## Problem-Based Understanding

### Problem 1: Count Operations

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Runs `n` times: **`O(n)`**.

### Problem 2: Nested Loop

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

`n x n = n^2`: **`O(n^2)`**.

### Problem 3: Half Loop

```java
for (int i = 0; i < n / 2; i++) {
    System.out.println(i);
}
```

The loop runs `n / 2` times; ignore the constant: **`O(n)`**.

### Problem 4: Increment by 2

```java
for (int i = 0; i < n; i += 2)
    ;
```

The loop runs `n / 2` times: **`O(n)`**.

### Problem 5: Logarithmic Loop

```java
for (int i = 1; i < n; i *= 2)
    ;
```

Values grow as `1 -> 2 -> 4 -> 8 -> ...`: **`O(log n)`**.

## Best Case vs. Worst Case

Example: linear search.

```java
for (int i = 0; i < n; i++) {
    if (arr[i] == target) return i;
}
```

| Case  | Complexity |
| ----- | ---------- |
| Best  | `O(1)`     |
| Worst | `O(n)`     |

## Space Complexity

Space complexity is the extra memory used by a program.

### Example 1: Constant Space

```java
int a = 10;
```

Uses constant memory: **`O(1)`**.

### Example 2: Linear Space

```java
int[] arr = new int[n];
```

Memory grows with `n`: **`O(n)`**.

### Example 3: Quadratic Space

```java
int[][] matrix = new int[n][n];
```

Uses `n x n` memory: **`O(n^2)`**.

### Auxiliary Space

Auxiliary space is the extra space used apart from the input.

```java
int sum = 0;
```

Auxiliary space: **`O(1)`**.

For example:

```java
int[] arr = new int[n];
```

- Input space: `O(n)`
- Extra space: `O(1)`

## Time-Space Tradeoff

Sometimes faster code uses more memory, while code that uses less memory takes more time.

- Brute force: usually slower, uses less memory.
- Optimized approach: often faster, uses more memory.

## Common Mistakes

- Treating time complexity as seconds. Actual running time depends on the machine.
- Keeping constants: write `O(n)`, not `O(2n)`.
- Confusing nested loops with sequential loops.

## Why It Matters in Interviews

Time and space complexity are important because they are:

- Asked in coding rounds.
- Required for optimization.
- Used to compare solutions.

## Practice Questions

### Basic Level

1. Determine the time complexity:

   ```java
   for (int i = 0; i < n; i++)
       ;
   ```

2. Determine the time complexity:

   ```java
   for (int i = 0; i < n; i++)
       for (int j = 0; j < i; j++)
           ;
   ```

3. Determine the time complexity:

   ```java
   for (int i = n; i > 0; i /= 2)
       ;
   ```

4. Determine the time complexity:

   ```java
   for (int i = 0; i < n; i++)
       for (int j = 0; j < m; j++)
           ;
   ```

5. Determine the space complexity:

   ```java
   int[] arr = new int[n];
   ```

### Intermediate Level

6. ```java
   for (int i = 0; i < n; i++)
       for (int j = 0; j < n; j += 2)
           ;
   ```

7. ```java
   for (int i = 1; i < n; i *= 3)
       ;
   ```

8. ```java
   for (int i = 0; i < n; i++) {
       System.out.println(i);
   }
   for (int j = 0; j < n; j++) {
       System.out.println(j);
   }
   ```

9. ```java
   for (int i = 0; i < n; i++)
       for (int j = i; j < n; j++)
           ;
   ```

10. ```java
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j; k++) {
                System.out.println(i + j + k);
            }
        }
    }
    ```

### Advanced Thinking Level

11. ```java
    int i = 0;
    while (i < n) {
        i += 2;
    }
    ```

12. ```java
    int i = 1;
    while (i < n) {
        i *= 2;
    }
    ```

13. ```java
    for (int i = 0; i < n; i++) {
        i++;
    }
    ```

14. ```java
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < Math.sqrt(n); j++) {
            System.out.println(i + j);
        }
    }
    ```

15. ```java
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
    ```

### Space Complexity Practice

16. ```java
    int x = 10;
    ```

17. ```java
    int[] arr = new int[n];
    ```

18. ```java
    int[][] matrix = new int[n][n];
    ```

19. ```java
    int[] a = new int[n];
    int[] b = new int[n];
    ```

20. ```java
    int[][] grid = new int[n][m];
    ```

## Final Takeaway

Loops and arrays teach you how to solve problems. Time complexity teaches you how efficiently you solve them, while space complexity teaches you how smartly you use memory.

Writing a working solution is step 1. Writing an efficient solution is step 2.

As you progress:

- Beginners focus on correctness.
- Intermediate learners focus on logic.
- Advanced learners focus on optimization.
