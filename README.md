# Algorithms and Data Structures

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![C++ planned](https://img.shields.io/badge/C%2B%2B-planned-00599C?style=for-the-badge&logo=cplusplus&logoColor=white)
<br>
[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](leetcode/README.md)
[![NeetCode roadmap](https://img.shields.io/badge/Problems_from-NeetCode-1F2937?style=for-the-badge)](https://neetcode.io/)
[![Last commit](https://img.shields.io/github/last-commit/jg-abreu/algorithms-and-data-structures?style=for-the-badge)](https://github.com/jg-abreu/algorithms-and-data-structures/commits/main)

My personal log of algorithm and data structure practice. Every problem in this repository was **solved by me and accepted on the platform**, and is stored with its official statement, the exact code I submitted and its submission statistics.

> I pick problems from [NeetCode](https://neetcode.io/) and solve them on [LeetCode](https://leetcode.com/) in Java and Python. C++ and competitive programming platforms (CSES, Codeforces, AtCoder) come next.

## 🔎 Quick Navigation

| I want to… | Go to |
|---|---|
| See every solved problem | [LeetCode index](leetcode/README.md) |
| See totals by platform and difficulty | [Progress](#-progress) |
| Understand how solutions are recorded | [AGENTS.md](AGENTS.md) |

## 📌 What Each Problem Contains

Each problem folder, such as [0001-two-sum](leetcode/0001-two-sum), contains:

- **`README.md`** — the official statement, difficulty and topic tags, plus a table with runtime, memory, percentiles and the evidence of acceptance.
- **`<problem>.java` / `.py` / `.cpp`** — the exact code I submitted, one file per language actually used.

The code is kept as submitted, including brute-force first attempts, so the repository shows how my problem solving evolves rather than polished reference answers.

## 🎯 Goals

- Build a **consistent practice habit** — a little every day beats a lot once in a while.
- Learn to recognize **common patterns** (hashing, two pointers, sliding window, etc.) instead of memorizing answers.
- Always start with a **brute-force solution**, then look for a better one.
- Prepare for **technical interviews** and coding assessments.
- Gradually build a foundation for **competitive programming** with C++.

## 🧠 Study Workflow

Before starting a problem, I check the platform index to see whether I have already solved it and review the existing record when revisiting it or practicing another language.

1. **Try independently for up to 30 minutes:** understand the statement, work through examples and develop an approach, starting with brute force.
2. **Ask for a small hint if stuck:** use a gradual hint from Claude, then try again for **10–15 minutes**.
3. **Discuss the reasoning if still stuck:** work through the approach step by step, with one question at a time. I write the solution; complete code is provided only if I explicitly request it.
4. **Review the solution:** explain the approach, analyze time and space complexity, and check edge cases before submitting.
5. **Submit and record:** after Accepted/AC, provide the complete submitted code and acceptance evidence, then follow [AGENTS.md](AGENTS.md) to record the solution and update indexes and totals.

The 30-minute mark is a checkpoint: if I am making progress, I can continue; if I am repeating the same unsuccessful attempt, I can ask for help earlier.

## 🛠️ Languages

| Language | Status | Why I use it |
|---|---|---|
| **Java** | Active | Current language for daily LeetCode practice and interview preparation. |
| **Python** | Reference | Earlier solutions, preserved so some problems can be compared side by side with Java. |
| **C++** | Planned | Algorithm practice and competitive programming as my studies progress. |

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

The three extensions illustrate possible solutions; files are added only when a solution exists. Independent C++ course exercises belong in [Daily Learning Log](https://github.com/jg-abreu/daily-learning-log).

See [AGENTS.md](AGENTS.md) for the submission workflow, naming rules, commit messages and index updates.

Platform READMEs keep the problem indexes; the totals below are recalculated from evidenced accepted solutions and count each problem once, regardless of language or repeated submissions. Historical metrics cite the original LeetHub commits; commit dates are not treated as submission dates.

## 📊 Progress

<!-- PROGRESS:START -->
| Platform | Solved | Easy | Medium | Hard | Unclassified |
|---|---:|---:|---:|---:|---:|
| [leetcode](leetcode/README.md) | 11 | 6 | 5 | 0 | 0 |
| [cses](cses/README.md) | 0 | 0 | 0 | 0 | 0 |
| [codeforces](codeforces/README.md) | 0 | 0 | 0 | 0 | 0 |
| [atcoder](atcoder/README.md) | 0 | 0 | 0 | 0 | 0 |
| **Total** | **11** | **6** | **5** | **0** | **0** |
<!-- PROGRESS:END -->
