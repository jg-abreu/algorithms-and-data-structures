# Algorithms and Data Structures

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=cplusplus&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)

My personal collection of algorithm and data structure solutions, starting with LeetCode in Java and Python and expanding toward C++ and competitive programming.

Accepted submissions are recorded from screenshots, submission links and the complete solution code. Statements, performance data, topic indexes and statistics are maintained with the workflow in [AGENTS.md](AGENTS.md).

## 🎯 Goals

- Build a **consistent practice habit** — a little every day beats a lot once in a while.
- Learn to recognize **common patterns** (hashing, two pointers, sliding window, etc.) instead of memorizing answers.
- Always start with a **brute-force solution**, then look for a better one.
- Prepare for **technical interviews** and coding assessments.
- Gradually build a foundation for **competitive programming** with C++.

## 🛠️ Languages

| Language | Why I use it |
|---|---|
| **Python** | Algorithm practice and earlier solutions preserved for reference. |
| **Java** | Current language for daily LeetCode practice and interview preparation. |
| **C++** | Algorithm practice and competitive programming as my studies progress. |

Some existing problems are solved in both Java and Python, so the two versions can be compared side by side. C++ solutions will be added as my studies progress.

## 📁 Repository Structure

Problems are organized by platform. Each problem contains its statement and the languages actually used to solve it:

```text
algorithms-and-data-structures/
├── README.md
├── AGENTS.md
├── .gitignore
├── leetcode/
│   ├── README.md
│   └── <problem-id>-<problem-name>/
│       ├── README.md
│       ├── <problem-id>-<problem-name>.java
│       ├── <problem-id>-<problem-name>.py
│       └── <problem-id>-<problem-name>.cpp
├── cses/
│   ├── README.md
│   └── <task-id>-<problem-name>/
│       ├── README.md
│       ├── <task-id>-<problem-name>.java
│       ├── <task-id>-<problem-name>.py
│       └── <task-id>-<problem-name>.cpp
├── codeforces/
│   ├── README.md
│   └── <contest-id>-<index>-<problem-name>/
│       ├── README.md
│       ├── <contest-id>-<index>-<problem-name>.java
│       ├── <contest-id>-<index>-<problem-name>.py
│       └── <contest-id>-<index>-<problem-name>.cpp
└── atcoder/
    ├── README.md
    └── <task-id>-<problem-name>/
        ├── README.md
        ├── <task-id>-<problem-name>.java
        ├── <task-id>-<problem-name>.py
        └── <task-id>-<problem-name>.cpp
```

The three extensions illustrate possible solutions; files are added only when a solution exists. Each problem directory contains only its README and solution files named after the directory. The README holds verified submission statistics, evidence, official topics and any notes supplied by me. Independent C++ course exercises belong in [Daily Learning Log](https://github.com/jg-abreu/daily-learning-log).

See [AGENTS.md](AGENTS.md) for the submission workflow, naming rules, commit messages and index updates.

Submission statistics are recorded in each problem README. Platform READMEs keep the problem indexes; the totals below are recalculated from evidenced accepted solutions and count each problem once, regardless of language or repeated submissions. Historical metrics cite the original LeetHub commits; commit dates are not treated as submission dates.

## 📊 Progress

<!-- PROGRESS:START -->
| Platform | Solved | Easy | Medium | Hard | Unclassified |
|---|---:|---:|---:|---:|---:|
| [leetcode](leetcode/README.md) | 9 | 6 | 3 | 0 | 0 |
| [cses](cses/README.md) | 0 | 0 | 0 | 0 | 0 |
| [codeforces](codeforces/README.md) | 0 | 0 | 0 | 0 | 0 |
| [atcoder](atcoder/README.md) | 0 | 0 | 0 | 0 | 0 |
| **Total** | **9** | **6** | **3** | **0** | **0** |
<!-- PROGRESS:END -->

## 📊 Solved Problems by Topic

The index below groups problems by their official platform topics. A topic label does not necessarily describe the algorithm used by the saved solution.

---

<!-- PROBLEM-TOPICS:START -->
### LeetCode
#### Array
|  |
| ------- |
| [0001-two-sum](leetcode/0001-two-sum) |
| [0049-group-anagrams](leetcode/0049-group-anagrams) |
| [0128-longest-consecutive-sequence](leetcode/0128-longest-consecutive-sequence) |
| [0169-majority-element](leetcode/0169-majority-element) |
| [0217-contains-duplicate](leetcode/0217-contains-duplicate) |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### Boyer–Moore Majority Vote Algorithm
|  |
| ------- |
| [0169-majority-element](leetcode/0169-majority-element) |
#### Bucket Sort
|  |
| ------- |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### Counting
|  |
| ------- |
| [0169-majority-element](leetcode/0169-majority-element) |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
| [0383-ransom-note](leetcode/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](leetcode/0387-first-unique-character-in-a-string) |
#### Divide and Conquer
|  |
| ------- |
| [0169-majority-element](leetcode/0169-majority-element) |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### Hash Table
|  |
| ------- |
| [0001-two-sum](leetcode/0001-two-sum) |
| [0049-group-anagrams](leetcode/0049-group-anagrams) |
| [0128-longest-consecutive-sequence](leetcode/0128-longest-consecutive-sequence) |
| [0169-majority-element](leetcode/0169-majority-element) |
| [0217-contains-duplicate](leetcode/0217-contains-duplicate) |
| [0242-valid-anagram](leetcode/0242-valid-anagram) |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
| [0383-ransom-note](leetcode/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](leetcode/0387-first-unique-character-in-a-string) |
#### Heap (Priority Queue)
|  |
| ------- |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### Queue
|  |
| ------- |
| [0387-first-unique-character-in-a-string](leetcode/0387-first-unique-character-in-a-string) |
#### Quickselect
|  |
| ------- |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### Sorting
|  |
| ------- |
| [0049-group-anagrams](leetcode/0049-group-anagrams) |
| [0169-majority-element](leetcode/0169-majority-element) |
| [0217-contains-duplicate](leetcode/0217-contains-duplicate) |
| [0242-valid-anagram](leetcode/0242-valid-anagram) |
| [0347-top-k-frequent-elements](leetcode/0347-top-k-frequent-elements) |
#### String
|  |
| ------- |
| [0049-group-anagrams](leetcode/0049-group-anagrams) |
| [0242-valid-anagram](leetcode/0242-valid-anagram) |
| [0383-ransom-note](leetcode/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](leetcode/0387-first-unique-character-in-a-string) |
#### Union-Find
|  |
| ------- |
| [0128-longest-consecutive-sequence](leetcode/0128-longest-consecutive-sequence) |
<!-- PROBLEM-TOPICS:END -->
