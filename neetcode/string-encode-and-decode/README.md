<h2><a href="https://neetcode.io/problems/string-encode-and-decode">Encode and Decode Strings</a></h2><h3>Medium</h3><hr>

<p>Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.</p>

<p>Machine 1 (sender) has the function:</p>

<pre>
String encode(List&lt;String&gt; strs) {
    // ... your code
    return encoded_string;
}
</pre>

<p>Machine 2 (receiver) has the function:</p>

<pre>
List&lt;String&gt; decode(String encoded_string) {
    // ... your code
    return decoded_strs;
}
</pre>

<p>So Machine 1 does:</p>

<pre>
String encoded_string = encode(strs);
</pre>

<p>and Machine 2 does:</p>

<pre>
List&lt;String&gt; decoded_strs = decode(encoded_string);
</pre>

<p><code>decoded_strs</code> in Machine 2 should be the same as the input <code>strs</code> in Machine 1.</p>

<p>Implement the <code>encode</code> and <code>decode</code> methods.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> strs = ["Hello","World"]

<strong>Output:</strong> ["Hello","World"]
</pre>

<p><strong>Explanation:</strong></p>

<pre>
Solution solution = new Solution();
String encoded_string = solution.encode(strs);

// Machine 1 ---encoded_string---&gt; Machine 2

List&lt;String&gt; decoded_strs = solution.decode(encoded_string);
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> strs = [""]

<strong>Output:</strong> [""]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= strs.length &lt; 100</code></li>
	<li><code>0 &lt;= strs[i].length &lt; 200</code></li>
	<li><code>strs[i]</code> contains any possible characters out of <code>256</code> valid ASCII characters.</li>
</ul>

<p><strong>Follow up:</strong> Could you write a generalized algorithm to work on any possible set of characters?</p>

Source: [NeetCode — Encode and Decode Strings](https://neetcode.io/problems/string-encode-and-decode). The statement was provided by João from the NeetCode problem page, and the follow-up comes from his screenshot of the same page. This problem is LeetCode Premium-only (LeetCode 271), so it was solved in the NeetCode editor.

## Topics

Not recorded: the NeetCode topic tags were not provided.

## Submission Statistics

The 2026-11-09 Java row comes from João's screenshot of the NeetCode submission page (Accepted, 61/61 test cases); the submitted time is the one displayed by NeetCode in his local timezone. NeetCode did not show a public submission ID, so none is recorded.

<!-- SUBMISSIONS:START -->
| Solution | Language | Status / evidence basis | Runtime | Memory | Runtime percentile | Memory percentile | Submission URL / ID | Submitted at | Evidence |
|---|---|---|---|---|---|---|---|---|---|
| [string-encode-and-decode.java](string-encode-and-decode.java) | Java | Accepted (screenshot) | 154ms | 63.9 MB | 97.71% | 89.06% | — | 2026-11-09T07:09-03:00 | Screenshot provided by João |
<!-- SUBMISSIONS:END -->
