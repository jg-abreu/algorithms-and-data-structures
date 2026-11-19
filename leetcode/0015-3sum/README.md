<h2><a href="https://leetcode.com/problems/3sum">15. 3Sum</a></h2><h3>Medium</h3><hr><p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>

<p>Notice that the solution set must not contain duplicate triplets.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
<strong>Explanation:</strong> 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1]
<strong>Output:</strong> []
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> [[0,0,0]]
<strong>Explanation:</strong> The only possible triplet sums up to 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= nums.length &lt;= 3000</code></li>
	<li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>

Source: [LeetCode](https://leetcode.com/problems/3sum).

## Topics

— (not yet recorded: the official LeetCode page could not be consulted when this record was created, and the tags were not included in the provided statement).

The difficulty is the one shown in the statement João provided from LeetCode.

## Submission Statistics

The Java row comes from João's screenshot of the LeetCode submission page (Accepted, 316/316 test cases) and the source he provided; the submitted time is the one displayed by LeetCode in his local timezone.

<!-- SUBMISSIONS:START -->
| Solution | Language | Status / evidence basis | Runtime | Memory | Runtime percentile | Memory percentile | Submission URL / ID | Submitted at | Evidence |
|---|---|---|---|---|---|---|---|---|---|
| [0015-3sum.java](0015-3sum.java) | Java | Accepted (screenshot) | 748 ms | 59.32 MB | 9.01% | 26.06% | [2199045658](https://leetcode.com/problems/3sum/submissions/2199045658/) | 2026-11-18T23:53-03:00 | Screenshot provided by João |
<!-- SUBMISSIONS:END -->
