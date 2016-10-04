题目名称：
反转链表

题目如下：
输入一个链表，反转链表后，输出链表的所有元素。

解题思路：
root保存新链表的根节点，now保存当前遍历到原有链表的位置，now_next保存now的下一个节点，因为我们后来要把now.next设置为root，再root=now,会失去now之后的节点信息，所以需要提前保存。

注意事项：
1.求解的鲁棒性，考虑head为null的情况
2.head.next要设置为null,不然就形成了换head.next=head.next.next