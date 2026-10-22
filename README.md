# Java + DSA Learning Repo

**Remote:** [jatin-prajapati/Java-Learning](https://origin.cursor.com/jatin-prajapati/Java-Learning) on Cursor Origin  
Clone: `git clone https://origin.cursor.com/jatin-prajapati/Java-Learning.git`

My own code, organised by topic so I can revise fast. One concept per file.
Every file = **my original code** (only the `//` comment markers removed so it runs, and the class renamed to match the file name).
At the bottom of each file there is an **AI REVISION NOTES** block (complexity, interview tips, bugs I should know about). Nothing above it is AI written.

## How to run (Java 8)
```
cd <folder>
javac File_Name.java
java File_Name
```
Files where I fixed a mistake have a **WHAT WAS WRONG** block after the code explaining the bug and the fix.

## Progress

- [x] Programming with Java
  - [x] Variables & Data Types -> `02_Variables_DataTypes`
  - [x] Operators -> `03_Operators`
  - [ ] Conditional Statements -> `04_Conditionals` (not written yet)
  - [x] Loops (Flow Control) -> `05_Loops`
  - [x] Patterns -> `06_Patterns`
  - [x] Functions & Scope -> `07_Functions_Scope`
- [ ] Data Structures & Algorithms
  - [x] Arrays -> `08_Arrays` (2D arrays: todo)
  - [x] Searching -> `09_Searching`
  - [x] Sorting Algorithms -> `10_Sorting` (bubble, selection, insertion; inbuilt sort: todo)
  - [ ] Strings
  - [ ] Pointers
  - [ ] Collections Framework
  - [ ] Time & Space Complexity
  - [ ] Recursion & Backtracking
  - [ ] Divide & Conquer
  - [ ] OOPs
  - [ ] Linked Lists
  - [ ] Stacks & Queues
  - [ ] Binary Trees
  - [ ] Binary Search Trees
- [ ] Advanced DSA: Heaps, HashMaps & HashSets, Tries, Graph, Greedy, Dynamic Programming, Segment Trees
- [ ] Quant, Reasoning & Aptitude

`Practice_Problems/` holds contest / LeetCode style attempts.
`01_Java_Basics/` holds Hello World and how Java runs (JDK / JRE / JVM).

## Quick complexity cheat sheet (from the files here)

| Topic | Time | Space |
|---|---|---|
| Linear search | O(n) | O(1) |
| Binary search (sorted) | O(log n) | O(1) |
| Reverse array (two pointers) | O(n) | O(1) |
| All subarrays (brute force sum) | O(n^3) | O(1) |
| Max subarray with prefix sum | O(n^2) | O(n) |
| Max subarray (Kadane - to learn) | O(n) | O(1) |
| Bubble / Selection / Insertion sort | O(n^2) | O(1) |
