# ⚡ Bitwise Operators in Java

Welcome to this section of my **Java DSA Journey** 🚀  
This module focuses on **Bitwise Operators** — a powerful concept for writing optimized and smart code.

---

## 📖 Introduction

Till now, we have learned:

- 🧠 Variables → Store data
- 🔁 Loops → Repeat logic
- 📦 Arrays → Manage data
- ⏱️ Time Complexity → Optimize performance

Now we step into a **low-level but powerful concept**:

👉 **Bitwise Operators**

---

## 💡 What are Bitwise Operators?

Bitwise operators work at the **binary level (bits)**.

👉 Every number in a computer is stored in binary (0s and 1s)

### Example

5 → 00000101
3 → 00000011

👉 Operations are performed **bit by bit**

---

## 🎯 Why Learn Bitwise Operators?

Bitwise operators are widely used in:

- ⚡ Code optimization
- 🧠 Competitive programming
- 💻 System-level programming
- 🔐 Cryptography
- 🚀 Fast calculations
- 🎯 DSA interview tricks

---

## 🔢 Binary Basics (Important)

### Decimal → Binary

| Decimal | Binary |
| ------- | ------ |
| 1       | 0001   |
| 2       | 0010   |
| 3       | 0011   |
| 4       | 0100   |
| 5       | 0101   |
| 6       | 0110   |

---

## 🧩 Types of Bitwise Operators

| `&` | AND |

| `       |` | OR |

| `^` | XOR |

| `~` | NOT |

| `<<` | Left Shift |

| `>>` | Right Shift |

| `>>>` | Unsigned Right Shift |

---

## 🔹 1. Bitwise AND (`&`)

### Rule

1 & 1 = 1

1 & 0 = 0

0 & 1 = 0

0 & 0 = 0

👉 Only 1 if **both bits are 1**

### Example

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b);
1

```

## 🔹 2. Bitwise OR (`|`)

### Rule

1 | 1 = 1

1 | 0 = 1

0 | 1 = 1

0 | 0 = 0

## 🔹 3. Bitwise XOR (`^`)

### Rule

1 ^ 1 = 0

1 ^ 0 = 1

0 ^ 1 = 1

0 ^ 0 = 0

## ⭐ Special XOR Properties

a ^ a = 0

a ^ 0 = a

a ^ b ^ a = b

## 🔹 3. Bitwise NOT (`~`)

### Rule

1 ~ 0

0 ~ 1

## ❌ Common Mistakes

❌ & vs &&

❌ Ignoring binary
representation

❌ Blindly using shifts

## 🎯 Interview Importance

Bitwise is used in:

- XOR tricks

- Bit masking

- Subset generation

- Optimization problems

## ⭐ If you found this helpful, consider starring the repo!

---

If you want next 🔥 level:
:contentReference[oaicite:0]{index=0}
