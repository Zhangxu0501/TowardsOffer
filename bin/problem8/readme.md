题目名称：
旋转数组的最小数字

题目如下：
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

解题思路：
利用数组部分有序的特性构建二分查找（非常重要！！！）
二分查找结束条件，当end-start=1的时候，此时end为最小值。
之前一直判断mid处于两个有序数组中的哪一个，来决定mid替换start还是end。

边界问题：
start=end=mid//三处值相等时我们无法判断mid位置，通过全数组扫描来得到min
数组长度为0
移动了0个的时候，即数组就是有序数组。//代码中没有体现出来？