题目名称：
数值的整数次方

题目如下：
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

解题思路：
主要需要注意浮点数为0的判断：需要与0做差，如果差很小，认为底数为0，这个时候需要抛出异常
指数为负数的时候要考虑。

提升效率的方法：
a的n次幂=a的2*（n/2）次幂//当n为偶数的时候！考虑到这里即可。
