题目名称：
用两个栈实现队列

题目如下：
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

解题思路：
最初始的想法可行，但效率有些低下：push时直接压如s1，pop的时候将s1压入s2，随后s2pop出一个，得到队首，然后将s2push到s1。
效率最高的做法是，push时直接压如s1，pop时从s2 pop，当s2为空时，将s1全部push到s2，否则s2.pop就可以了。