<h2><a href="https://leetcode.com/problems/daily-temperatures">739. Daily Temperatures</a></h2><h3>Medium</h3><hr><p>Given an array of integers <code>temperatures</code> represents the daily temperatures, return <em>an array</em> <code>answer</code> <em>such that</em> <code>answer[i]</code> <em>is the number of days you have to wait after the</em> <code>i<sup>th</sup></code> <em>day to get a warmer temperature</em>. If there is no future day for which this is possible, keep <code>answer[i] == 0</code> instead.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> temperatures = [73,74,75,71,69,72,76,73]
<strong>Output:</strong> [1,1,4,2,1,1,0,0]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> temperatures = [30,40,50,60]
<strong>Output:</strong> [1,1,1,0]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> temperatures = [30,60,90]
<strong>Output:</strong> [1,1,0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;temperatures.length &lt;= 10<sup>5</sup></code></li>
	<li><code>30 &lt;=&nbsp;temperatures[i] &lt;= 100</code></li>
</ul>

Source: [LeetCode](https://leetcode.com/problems/daily-temperatures).

## Topics

Array, Stack, Monotonic Stack

Topic labels and difficulty are taken from the official LeetCode problem page.

## Submission Statistics

The Java row comes from João's screenshot of the LeetCode submission page (Accepted, 48/48 test cases) and the source he provided; the submitted time is the one displayed by LeetCode in his local timezone.

João reports that he solved this problem on 2026-11-13, but the original submission failed on the platform and was not recorded. The Accepted evidence below is the resubmission of 2026-11-14; the commit adding this record was dated 2026-11-13 at his request, and that date is not a submission date.

<!-- SUBMISSIONS:START -->
| Solution | Language | Status / evidence basis | Runtime | Memory | Runtime percentile | Memory percentile | Submission URL / ID | Submitted at | Evidence |
|---|---|---|---|---|---|---|---|---|---|
| [0739-daily-temperatures.java](0739-daily-temperatures.java) | Java | Accepted (screenshot) | 52 ms | 102.55 MB | 73.03% | 95.03% | [2196262341](https://leetcode.com/problems/daily-temperatures/submissions/2196262341/) | 2026-11-14T23:28-03:00 | Screenshot provided by João |
<!-- SUBMISSIONS:END -->
