# Three way partitioning
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of size n&nbsp;and a range [<strong style="user-select: auto;">a</strong>, <strong style="user-select: auto;">b</strong>]. The task is to partition the array around the range such that array is divided into three parts.<br style="user-select: auto;">
1) All elements smaller than <strong style="user-select: auto;">a</strong> come first.<br style="user-select: auto;">
2) All elements in range <strong style="user-select: auto;">a</strong> to <strong style="user-select: auto;">b</strong> come next.<br style="user-select: auto;">
3) All elements greater than <strong style="user-select: auto;">b</strong> appear in the end.<br style="user-select: auto;">
<lclighter data-id="lgt258877904" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto; background-color: initial;">The individual elements of three sets can appear in any order. You are required to return the modified array.</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="258877904" data-bundle-id="0" id="lgt258877904" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-2/M.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation</strong>: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.</span>

</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
n = 3 
A[] = {1, 2, 3}
[a, b] = [1, 3]
<strong style="user-select: auto;">Output</strong>: 1
<strong style="user-select: auto;">Explanation: </strong>One possible arrangement 
is: {1, 2, 3}. If you return a valid
arrangement, output will be 1.

</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task: </strong><br style="user-select: auto;">
You dont need to read input or print anything.&nbsp;The task is to complete the function <strong style="user-select: auto;">threeWayPartition()</strong> which takes the array[], a and b as input parameters and modifies the array in-place according to the given conditions.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong> The generated output is 1 if you modify the given array successfully.</span><br style="user-select: auto;">
<br style="user-select: auto;">
<br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(n)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span><br style="user-select: auto;">
<br style="user-select: auto;">
<br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= n&nbsp;&lt;= 10</span><sup style="user-select: auto;"><span style="font-size: 15px; user-select: auto;">6</span></sup><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= A[i] &lt;= 10<sup style="user-select: auto;">6</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>