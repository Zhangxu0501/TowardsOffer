题目如下：
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。


解题思路：
有两种解决方案：
1.从前向后替换，O(n2),是因为后面的字符被后移多次
2.先统计空格数和其它字符数，这样可以计算出替换后的字符数，然后替换，时间复杂度O(n)