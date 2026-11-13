<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation">150. Evaluate Reverse Polish Notation</a></h2><h3>Medium</h3><hr><p>You are given an array of strings <code>tokens</code> that represents an arithmetic expression in a <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation" target="_blank">Reverse Polish Notation</a>.</p>

<p>Evaluate the expression. Return <em>an integer that represents the value of the expression</em>.</p>

<p><strong>Note</strong> that:</p>

<ul>
	<li>The valid operators are <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, and <code>'/'</code>.</li>
	<li>Each operand may be an integer or another expression.</li>
	<li>The division between two integers always <strong>truncates toward zero</strong>.</li>
	<li>There will not be any division by zero.</li>
	<li>The input represents a valid arithmetic expression in a reverse polish notation.</li>
	<li>The answer and all the intermediate calculations can be represented in a <strong>32-bit</strong> integer.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["2","1","+","3","*"]
<strong>Output:</strong> 9
<strong>Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["4","13","5","/","+"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong>Output:</strong> 22
<strong>Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= tokens.length &lt;= 10<sup>4</sup></code></li>
	<li><code>tokens[i]</code> is either an operator: <code>&quot;+&quot;</code>, <code>&quot;-&quot;</code>, <code>&quot;*&quot;</code>, or <code>&quot;/&quot;</code>, or an integer in the range <code>[-200, 200]</code>.</li>
</ul>

Source: [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation).


## Topics

Array, Math, Stack

Topic labels and difficulty are taken from the official LeetCode problem page.

## Submission Statistics

The Java row comes from João's screenshot of the LeetCode submission page (Accepted, 24/24 test cases) and the source he provided; the submitted time is the one displayed by LeetCode in his local timezone.

<!-- SUBMISSIONS:START -->
| Solution | Language | Status / evidence basis | Runtime | Memory | Runtime percentile | Memory percentile | Submission URL / ID | Submitted at | Evidence |
|---|---|---|---|---|---|---|---|---|---|
| [0150-evaluate-reverse-polish-notation.java](0150-evaluate-reverse-polish-notation.java) | Java | Accepted (screenshot) | 8 ms | 46.22 MB | 13.30% | 9.22% | [2194957115](https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/2194957115/) | 2026-11-12T21:15-03:00 | Screenshot provided by João |
<!-- SUBMISSIONS:END -->
