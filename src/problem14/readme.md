题目名称：
调整数组顺序使奇数位于偶数前面

题目如下：
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

解题思路：
不考虑顺序的时候，两个指针，一直指向数组头部，一个指向尾部，当头指针发现一个偶数，尾指针发现一个奇数，交换头尾的值，循环结束条件头指针>=尾指针。
考虑顺序的时候，有如下解法。头指针发现偶数之后，将偶数向后冒泡，冒泡到下一个偶数的前面，尾指针发现一个奇数将奇数冒泡到一个奇数的后面。
试过之后发现上面的解法行不通，因为需要把所有偶数往后冒泡。。。
简单暴力解法：扫描两遍数组，第一遍扫描奇数，放在结果数组前面，第二遍扫描偶数组，放在结果数组后面，ok了就。