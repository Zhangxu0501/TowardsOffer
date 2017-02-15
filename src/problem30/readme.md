#题目名称：
最小的k个数
#题目如下：
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
#核心要点&注意事项

#解题思路：
#####解法一
On
还是利用partation函数，逐步找到第k个小的位置
public static int part(int [] numbers,int start,int end)
	{
		int k=numbers[start];
		int i=start;
		int j=end+1;
		while(true)
		{
			while(compareto(k,numbers[++i])>0&&i<end);
			while(compareto(k,numbers[--j])<0&&j>start);
			if(i>=j)
				break;
			swap(numbers,i,j);
		}
		swap(numbers,start,j);
		return j;
	}


#####解法二
利用最大堆来存储k个数字，遍历整个数据，如果当前数字比堆顶数字还小，删除堆顶数字，插入当前数字，遍历完整个数据集后便得到了k个数字，这种做法适合处理海量数据Nlogk
